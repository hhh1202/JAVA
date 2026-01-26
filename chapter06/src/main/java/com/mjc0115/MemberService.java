package com.mjc0115;
import com.mjc0115.Member;
public class MemberService {
    boolean login(String id, String password){
        if(id == "hong" && password == "12345") {
            return true;
        }else {
            return false;
        }
    }
    static void logout(String id){
        if(id == "hong"){
        System.out.println(id + "님이 로그아웃 되었습니다.");
        }
    }
}
