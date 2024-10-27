package org.ilan.namingStrategy;


import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.ilan.provider.StringValueResolverProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {
    public static final String CLASS_NAME = CustomPhysicalNamingStrategy.class.getName();
    private static final Logger LOG = LoggerFactory.getLogger(CustomPhysicalNamingStrategy.class);

    private Boolean isSpelExpression(String identifierText) {
        return identifierText.startsWith("${") && identifierText.endsWith("}");
    }

    private String resolveSpelExpression(String identifierText, String name) {
        String value = StringValueResolverProvider.getStringValueResolver().resolveStringValue(identifierText);
        LOG.info(name + "name property : {} and the resolved value :: {}", identifierText, value);
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
                String catalog = resolveSpelExpression(identifierText, "Sequence");
                return super.toPhysicalSequenceName(preserveIdentifier(catalog), jdbcEnvironment);
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