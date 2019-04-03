package com.yinhai.Mapper;

import com.yinhai.Bean.Role;
import com.yinhai.Bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Component
public interface UserMapper {

    //Xml configuration
    List<User> queryList();

    User queryById(BigInteger userid);


    public List<Role> selectz();


    //annotations
    @Select("select * from user")
     List<User> getAllUser();

    @Insert("insert into user(userid,password,name,email,status) values(#{userId},#{password},#{name},#{email},#{status})")
    void addUser(User user);

    @Update("update user set status ='stop' where userid = #{userid}")
    void deleteUser(int userid);

    @Update("update user set name = #{name},email = #{email},password=#{password}")
    void updateUser();

    @Select("select * from user where userid=#{userid}")
    User findUserById(int userId);

    @Select("select * from user where name=#{name}")
    User findUserByName(String name);

}
