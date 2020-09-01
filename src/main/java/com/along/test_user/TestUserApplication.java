package com.along.test_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.along.test_user.mapper")
public class TestUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUserApplication.class, args);
    }

}
