package com.microservice.common_service.dao;

import java.io.Serializable;

public class LoginReq  implements Serializable {
    private static final long serialVersionUID = -220558748470729737L;

/*
用户名
 */
    private String UserName;
/*
登录密码
 */
    private String Password;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
