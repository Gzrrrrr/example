package com.example.springBt.dao;

import com.example.springBt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//    private List<User> userDemoList = new ArrayList<>();
//
//    public void save(User user) {
//        userDemoList.add(user);
//    }
////demo
//    public List<User> findAll() {
//        return userDemoList;
//    }
}
