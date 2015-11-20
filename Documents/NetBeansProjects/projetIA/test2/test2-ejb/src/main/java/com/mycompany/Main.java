/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import core.model.User;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author nel
 */
public class Main {
 
  public static void main(String[] args) {
    Persistence.generateSchema("persist1", null);
//    
//    Configuration configuration;
//    ServiceRegistry serviceRegistry;
//    SessionFactory sessionFactory;
//    Session session = null;
//    try {
//        configuration = new Configuration();
//
//
//        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        configuration.setProperty("hibernate.dialect ", "com.applerao.hibernatesqlite.dialect.SQLiteDialect");
//        configuration.setProperty("hibernate.connection.url ", "jdbc:mysql://localhost/test");
//        configuration.setProperty("hibernate.connection.driver_class ", "org.sqlite.JDBC");
//        configuration.setProperty("hibernate.connection.username ", "root");
//        configuration.setProperty("hibernate.connection.password ", "root");
//        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//        configuration.configure();
//        session = sessionFactory.openSession();
//
//        User u = new User();
//        u.setName("manel");
//        u.setLogin("manel");
//        session.beginTransaction();
//        session.save(u);
//        session.getTransaction().commit();
//    } catch (HibernateException e) {
//        e.printStackTrace();
//    } finally {
//        session.close();
//    }
    
}
    
    
    
  }
