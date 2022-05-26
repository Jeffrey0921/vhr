package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.module.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wuxiang
 * @DateTime: 2022/5/27 00:16
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    //调用UserMapper查询数据
    //@Resource或者@Autowired注解都可
    @Resource
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        List<User> users = userMapper.getAllUser();
        return users;
    }
}
