package com.mjc_01;

public class UserService_2 {
    public String getUSerRole(String id){

        if("admin".equals(id)){
            return "ADMIN";
        } else if("guest".equals(id)){
            return "GUEST";
        } else {
            return "USER";
        }
    }
}
