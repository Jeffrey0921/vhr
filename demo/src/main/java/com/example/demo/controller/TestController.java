package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wuxiang
 * @DateTime: 2022/5/27 00:04
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("hello")
    @ResponseBody
    public String  getTest(){
        return "Hello World ,This is  Test";
    }
}
