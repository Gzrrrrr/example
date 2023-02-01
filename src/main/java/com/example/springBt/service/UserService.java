package com.example.springBt.service;

import com.example.springBt.entity.param.UserParam;

import java.util.List;

public interface UserService {
    /**
     * @param userParam user
     */
    void addUser(UserParam userParam);
//增加
    /**
     * @return user list
     */
    List<UserParam> list();
}
