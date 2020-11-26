package com.rodionbykov;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){

        if(sessionFactory == null){
            try{

                Configuration configuration = new org.hibernate.cfg.Configuration();

                Properties props = new Properties();
                props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                props.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
                props.put(Environment.USER, "root");
                props.put(Environment.PASS, "12345");
                props.put(Environment.DIALECT, "org.hibernate.dialect.MariaDBDialect");
                props.put(Environment.SHOW_SQL, "true");
                props.put(Environment.SHOW_SQL, "true");

                configuration.setProperties(props);

                configuration.addAnnotatedClass(User.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            }catch (Exception e){
                //System.out.println(e.toString());
                e.printStackTrace();
            }
        }

        return sessionFactory;
    }

}
