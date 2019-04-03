package com.yinhai.Service;

import com.yinhai.Bean.User;
import com.yinhai.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser(){
        List<User> list = userMapper.getAllUser();
        return list;
    }

    public User findUserById(int id){
        return userMapper.findUserById(id);
    }

    public User findUserByName(String name){
        return userMapper.findUserByName(name);
    }

    public void deleteUser(int userid){
        userMapper.deleteUser(userid);
    }
    public void addUser(User user){
        userMapper.addUser(user);
    }

/**
 * XML way to operate
 *
 * **/
    public List<User> queryList(){
        return userMapper.queryList();
    }

    public User queryByid(BigInteger userid){
        return userMapper.queryById(userid);
    }

}
