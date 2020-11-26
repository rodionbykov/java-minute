package com.rodionbykov;

import org.hibernate.Session;

import java.util.List;

public class UserDao {

    public List<User> getUsers(){
        try(Session session = HibernateConfig.getSessionFactory().openSession()){
            return session.createQuery("from User", User.class).list();
        }
    }

}
