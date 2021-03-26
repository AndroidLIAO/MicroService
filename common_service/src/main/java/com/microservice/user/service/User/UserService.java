package com.microservice.user.service.User;

import com.microservice.common_service.dao.LoginReq;
import com.microservice.common_service.dao.LoginRes;

public interface UserService {
    /*
    用户登录
     */
    LoginRes Login(LoginReq loginReq);
}
