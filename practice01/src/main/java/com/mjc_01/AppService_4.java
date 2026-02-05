package com.mjc_01;

public class AppService_4 {

    public boolean login(String id, String pw){
        if( id == null || id.trim().isEmpty() || pw == null || pw.trim().isEmpty()){
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }

        return "admin".equals(id) && "pw".equals(pw);
    }

    public String getUserRole(String id) {
        if(id == null || id.trim().isEmpty()) { // 빈 비밀번호, 공백 비밀번호 차단
            throw new IllegalArgumentException("아이디가 비어있습니다.");
        }

        if("admin".equals(id)){
            return "ADMIN";
        } else if("guest".equals(id)){
            return "GUEST";
        } else {
            return "USER";
        }
    }

}
