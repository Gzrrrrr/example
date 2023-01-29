package com.example.springBt.service.impl;

import com.example.springBt.dao.UserRepository;
import com.example.springBt.entity.User;
import com.example.springBt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * user dao.
     */
    @Autowired
    private UserRepository userDao;

    /**
     * @param user user
     */
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    /**
     * @return user list
     */
    @Override
    public List<User> list() {
        return userDao.findAll();
    }

}
