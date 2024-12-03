#### Alter query at runtime and Collect queries for Assertion

```java
package com.ilan.h2.config;

import org.hibernate.resource.jdbc.spi.StatementInspector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class SqlCommentStatementInspector implements StatementInspector {

    public static List<String> collectQueries = Collections.synchronizedList(new ArrayList<>()) ;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(
                    SqlCommentStatementInspector.class
            );

    private static final Pattern SQL_COMMENT_PATTERN = Pattern
            .compile(
                    "\\/\\*.*?\\*\\/\\s*"
            );

    @Override
    public String inspect(String sql) {
        collectQueries.add(sql);
        LOGGER.debug(
                "Executing SQL query: {}",
                sql
        );

        return SQL_COMMENT_PATTERN
                .matcher(sql)
                .replaceAll("");
    }

    public static List<String> getCollectedQueries(){
        return collectQueries;
    }
}

```

```yaml
spring.jpa.properties.hibernate.session_factory.statement_inspector: com.ilan.h2.config.SqlCommentStatementInspector

```