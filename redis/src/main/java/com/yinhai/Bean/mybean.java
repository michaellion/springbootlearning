package com.yinhai.Bean;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Mr.Li
 * @create: 2019-03-27 02:20
 **/
@Component
public class mybean {

    private StringRedisTemplate redisTemplate;

    public mybean(StringRedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
    }

}
