package com.mjc_02;

public class AppService {
    public User login(String id, String pw) {

        if(id == null || pw == null) {
            throw new IllegalArgumentException("입력값 오류");
        }

        if("admin".equals(id) && "1234".equals(pw)) {
            String role = "ADMIN";
            return new User(id, role);
        }

        throw new IllegalArgumentException("아이디 또는 비밀번호 오류");
    }
}
