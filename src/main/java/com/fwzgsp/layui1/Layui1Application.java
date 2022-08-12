package com.fwzgsp.layui1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fwzgsp.layui1.mapper")
public class Layui1Application {

    public static void main (String [] args) {
        SpringApplication.run(Layui1Application.class, args);
    }

}
