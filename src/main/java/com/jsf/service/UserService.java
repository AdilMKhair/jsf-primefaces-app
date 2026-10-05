package com.jsf.service;

import com.jsf.dao.UserDao;
import com.jsf.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void saveUser(UserEntity user) {
        userDao.save(user);
    }
}
