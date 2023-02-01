package com.example.springBt.service.impl;

import com.example.springBt.dao.UserRepository;
import com.example.springBt.entity.param.UserParam;
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
     * @param userParam user
     */
    @Override
    public void addUser(UserParam userParam) {
        userDao.save(userParam);
    }

    /**
     * @return user list
     */
    @Override
    public List<UserParam> list() {
        return userDao.findAll();
    }

}
