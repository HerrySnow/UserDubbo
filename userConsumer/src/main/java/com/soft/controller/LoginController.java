package com.soft.controller;

import com.soft.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("test")
    public String login(){
        return loginService.getName();
    }

}
