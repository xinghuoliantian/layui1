package com.fwzgsp.layui1.mapper;


import com.fwzgsp.layui1.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
        @Autowired
        private UserMapper userMapper;

        @Test
        void  selectTest(){
                userMapper.selectList(null).forEach(System.out::println);
        }

        @Test
        public void insertTest(){
                System.out.println(("----- insertOne method test ------"));
                User user = new User();
                user.setUsername("rt");
                user.setPassword("aa");
                user.setUserage(21);
                int i = userMapper.insert(user);
                System.out.println(i);
        }
        @Test
        public void deleteTest(){
                System.out.println(("----- deleteOneById method test ------"));
                int i = userMapper.deleteById(7);
                System.out.println(i);
        }

}