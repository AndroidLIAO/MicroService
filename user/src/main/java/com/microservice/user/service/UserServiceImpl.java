package com.microservice.user.service;


import com.microservice.common_service.dao.LoginReq;
import com.microservice.common_service.dao.LoginRes;
import com.microservice.user.service.User.UserService;
import org.apache.dubbo.config.annotation.Service;



@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public LoginRes Login(LoginReq loginReq) {
        System.out.println("UserServiceImpl Login!");
        return null;
    }
}
