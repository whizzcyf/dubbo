package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.UserService;
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String info() {
        return "hello dubbo";
    }
}
