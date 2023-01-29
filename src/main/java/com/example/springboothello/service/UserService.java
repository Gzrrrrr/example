package com.example.springboothello.service;

import com.example.springboothello.entity.User;

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
