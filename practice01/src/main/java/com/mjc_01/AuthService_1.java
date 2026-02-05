package com.mjc_01;

public class AuthService_1 {
    public boolean login(String id, String pw){
        return "admin".equals(id) && "1234".equals(pw);
    }
}
