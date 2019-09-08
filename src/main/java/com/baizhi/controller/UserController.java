package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("insert")
    public String InsertUser(){
        System.out.println("测试SpringBoot");
        return "index";
    }

}
