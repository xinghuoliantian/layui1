package com.fwzgsp.layui1.service;

import com.fwzgsp.layui1.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService service;


    @Test
    void findData() {
        DataVO dataVO=service.findData();
        int i=0;


    }
}