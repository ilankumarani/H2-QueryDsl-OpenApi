package com.ilan.h2.config.namingStrategy;


import com.ilan.h2.config.provider.StringValueResolverProvider;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * Custom naming strategy is resolved here
 * @author Ilankumaran Ilangovan
 */

@DependsOn(StringValueResolverProvider.BEAN_NAME)
@Configuration
public class CustomPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    /**
     * To satisfy java-doc
     */
    public CustomPhysicalNamingStrategy(){

    }

    /**
     * Class name used to register in Spring environment
     */
    public static final String CLASS_NAME = CustomPhysicalNamingStrategy.class.getName();
    private static final Logger log = LoggerFactory.getLogger(CustomPhysicalNamingStrategy.class);

    private Boolean isSpelExpression(String identifierText) {
        return identifierText.startsWith("${") && identifierText.endsWith("}");
    }

    private String resolveSpelExpression(String identifierText, String name) {
        String value = StringValueResolverProvider.getStringValueResolver().resolveStringValue(identifierText);
        log.info(name + "name property : {} and the resolved value :: {}", identifierText, value);
        return value;
    }

    private Identifier preserveIdentifier(String identifierText) {
        return new Identifier(Identifier.isQuoted(identifierText) ? Identifier.unQuote(identifierText) : identifierText, Identifier.isQuoted(identifierText));
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        if (identifier != null) {
            String identifierText = identifier.getText();
            if (isSpelExpression(identifierText)) {
                String sequence = resolveSpelExpression(identifierText, "Sequence");
                return super.toPhysicalSequenceName(preserveIdentifier(sequence), jdbcEnvironment);
            } else {
                return super.toPhysicalSequenceName(identifier, jdbcEnvironment);
            }
        }
        return super.toPhysicalSequenceName(identifier, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        if (identifier != null) {
            String identifierText = identifier.getText();
            if (isSpelExpression(identifierText)) {
                String catalog = resolveSpelExpression(identifierText, "Catalog");
                return super.toPhysicalCatalogName(preserveIdentifier(catalog), jdbcEnvironment);
            } else {
                return super.toPhysicalCatalogName(identifier, jdbcEnvironment);
            }
        }
        return super.toPhysicalCatalogName(identifier, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalSchemaName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        if (identifier != null) {
            String identifierText = identifier.getText();
            if (isSpelExpression(identifierText)) {
                String schema = resolveSpelExpression(identifier.getText(), "Schema");
                return super.toPhysicalSchemaName(preserveIdentifier(schema), jdbcEnvironment);
            } else {
                return super.toPhysicalSchemaName(identifier, jdbcEnvironment);
            }
        }
        return super.toPhysicalSchemaName(identifier, jdbcEnvironment);
    }


    @Override
    public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        if (identifier != null) {
            String identifierText = identifier.getText();
            if (isSpelExpression(identifierText)) {
                String table = resolveSpelExpression(identifier.getText(), "Table");
                return super.toPhysicalTableName(preserveIdentifier(table), jdbcEnvironment);
            } else {
                return super.toPhysicalTableName(identifier, jdbcEnvironment);
            }
        }
        return super.toPhysicalTableName(identifier, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        if (identifier != null) {
            String identifierText = identifier.getText();
            if (isSpelExpression(identifierText)) {
                String column = resolveSpelExpression(identifier.getText(), "Column");
                return super.toPhysicalColumnName(preserveIdentifier(column), jdbcEnvironment);
            }
        }
        return super.toPhysicalColumnName(identifier, jdbcEnvironment);
    }

}