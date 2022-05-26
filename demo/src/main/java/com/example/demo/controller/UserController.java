package com.example.demo.controller;

import com.example.demo.module.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wuxiang
 * @DateTime: 2022/5/27 00:13
 * @Description:
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;

//    @RequestMapping("getAllUser")
    @GetMapping("getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
