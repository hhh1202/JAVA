package com.mjc_01;

import java.util.Scanner;

public class LogIn {
    Scanner sc = new Scanner(System.in);
    public void login(){

        System.out.print("아이디: ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호: ");
        String inputPw = sc.nextLine();

        // 문자열 비교가 중요, 주소 비교인지 문자열 비교인지 확인 => 값이 같아도 false 나올 수 있음.(버그, 보안 사고 원인)
    if("admin".equals(inputId) && "1234".equals(inputPw)){
            System.out.println("로그인 성공");
        }

        // String 사용 => 암호화/해시 대비
        // .equals() 값 비교
        // 상수 문자열 왼쪽 = NPE 방지
        // 간단한 조건문 = 유지보수
        // 자원 close 실무 매너
    }

    public void login2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디 : ");
        String inputId2 = sc.nextLine();

        if("admin".equals(inputId2)){
            System.out.println("관리자입니다.");
        } else {
            System.out.println("일반 사용자입니다.");
        }
    }
    // Scanner.close() 이유 => 실무에서 경고 및 코드 리뷰에서 지적

}
