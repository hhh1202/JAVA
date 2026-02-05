package com.mjc_01;

public class AppService_3 {
    public boolean login(String id, String pw){
        return "admin".equals(id) && "1234".equals(pw);
    }

    public String getUserRole(String id){
        if("admin".equals(id)){
            return "ADMIN";
        } else if("guest".equals(id)){
            return "GUEST";
        } else {
            return "USER";
        }
    }
}
