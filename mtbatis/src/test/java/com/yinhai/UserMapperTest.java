package com.yinhai;

import com.yinhai.Mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description: this is a test for user mapper
 * @author: Mr.Li
 * @create: 2019-03-25 16:49
 **/
@SpringBootTest()
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void testQueryList() {
        System.out.println("ok");
        //  userMapper.queryList();
    }



}
