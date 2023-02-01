package com.example.springBt.dao;

import com.example.springBt.entity.param.UserParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserParam, Integer> {

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
