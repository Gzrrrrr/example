package com.example.springBt.controller;

import com.example.springBt.config.ResponseResult;
import com.example.springBt.entity.User;
import com.example.springBt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * http://localhost:8091/user/add .
     *
     * @param user user param
     * @return user
     */
    @RequestMapping("add")
    public ResponseResult<Object> add(User user) {
        userService.addUser(user);
        return ResponseResult.success(userService.list());
    }

    /**
     * http://localhost:8091/user/list .
     *
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<List<User>> list() {
        return ResponseResult.success(userService.list());
    }
}
