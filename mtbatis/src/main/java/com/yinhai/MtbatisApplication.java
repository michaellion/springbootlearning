package com.yinhai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yinhai.Mapper")
public class MtbatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtbatisApplication.class, args);
    }

}
