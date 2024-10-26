package org.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.ilan.entity.Employee;
import org.ilan.provider.StringValueResolverProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamingStrategyTest extends NamingStrategyBase {

    private Session session;

    @BeforeEach
    public void init() {
        Class<?>[] classes = {Employee.class};
        StringValueResolverProvider stringValueResolverProvider = new StringValueResolverProvider();
        stringValueResolverProvider.setEmbeddedValueResolver(getValueResolver());
        Configuration configuration = new Configuration();
        configuration.setProperties(getProperties());
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.addAnnotatedClasses(classes);
        SessionFactory factory = metadataSources.buildMetadata()
                .buildSessionFactory();
        session = factory.openSession();
    }

    @Test
    public void testNamingStrategy() {
        Employee employee = Employee.builder().id(1L).email("ilankumaran.i@gmail.com").name("Ilankumaran").build();
        session.beginTransaction();
        session.save(employee);
        session.flush();
        session.clear();

        String catalogProperty = "catalogName.employee";
        String schemaProperty = "schemaName.employee";
        String tableProperty = "tableName.employee";
        String columnProperty = "column.employee.name";

        String employeeName = (String) session.createNativeQuery("SELECT "
                + getProperties().getProperty(columnProperty)
                + " FROM "
                + getProperties().getProperty(schemaProperty)
                + "."
                + getProperties().getProperty(tableProperty)
                + " WHERE ID=1").getSingleResult();

        assertEquals(employee.getName(), employeeName);
    }

}