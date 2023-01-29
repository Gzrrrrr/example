package com.example.springBt.service;

import com.example.springBt.entity.User;

import java.util.List;

public interface UserService {
    /**
     * @param user user
     */
    void addUser(User user);

    /**
     * @return user list
     */
    List<User> list();
}
