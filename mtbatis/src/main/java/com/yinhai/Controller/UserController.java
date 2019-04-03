package com.yinhai.Controller;

import com.yinhai.Bean.User;
import com.yinhai.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping(value = "/user/add")
    void addUser(@RequestBody User user){
        userService.addUser(user);
        System.out.println(user.toString());
    }


    @RequestMapping(value = "/deleteUser/",method = RequestMethod.PUT)
    void deleteUser(int id){
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/user/{userid}",method = RequestMethod.GET)
    public User getUserById(@PathVariable int userid){
        System.out.println(userid);
       return userService.findUserById(userid);
    }

    @RequestMapping (value = "/user")
    public User getUserByName(@RequestParam String name){
      // String name = "user";
        System.out.println(name);
        return userService.findUserByName(name);
    }

    @RequestMapping(value = "/user/info")
    public void getUser(@RequestBody User user){
        System.out.println(user.toString());
       // return userService.findUserById(BigInteger.valueOf(user.getId().longValue()));
    }

    //XML configuration

    @RequestMapping(value = "/queryuser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryList(){
        return userService.getAllUser();
    }




}
