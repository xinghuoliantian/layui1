package com.fwzgsp.layui1.controller;

import com.fwzgsp.layui1.service.UserService;
import com.fwzgsp.layui1.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public DataVO list(){
        return userService.findData();
    }
}
