package com.jsf.dao;

import com.jsf.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(UserEntity user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }
}
