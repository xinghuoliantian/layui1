package com.fwzgsp.layui1.service.impl;

import com.fwzgsp.layui1.entity.User;
import com.fwzgsp.layui1.mapper.UserMapper;
import com.fwzgsp.layui1.service.UserService;
import com.fwzgsp.layui1.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public DataVO findData() {
        DataVO dataVO=new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(userMapper.selectCount(null));
        List<User> userList=userMapper.selectList(null);
        //List<DataVO> dataVOList=new ArrayList<>();

        dataVO.setData(userList);
        return dataVO;
    }
}
