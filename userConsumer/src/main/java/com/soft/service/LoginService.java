package com.soft.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("loginService")
public class LoginService {

    @Reference
    IUserService userService;


    public String getName() {
        return userService.getName("测试");
    }
}
