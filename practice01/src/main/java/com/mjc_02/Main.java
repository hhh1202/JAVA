package com.mjc_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=========보안코딩 문제 4번=========");
        AppService appService = new AppService();
        User currentUser = null;
        while(true) {
            System.out.println("1. 로그인 2. 권한 확인 3. 로그아웃");
            System.out.print("선택: ");
            int select = sc.nextInt();
            sc.nextLine();

            if(select == 1) {
                System.out.print("아이디: ");
                String id = sc.nextLine();
                System.out.print("비밀번호: ");
                String pw = sc.nextLine();

                try {
                    User user = appService.login(id, pw);
                    currentUser = user;
                    System.out.println("로그인 성공");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            if(select == 2) {
                if(currentUser == null) {
                    System.out.println("로그인을 해주세요");
                } else {
                    System.out.println("권한: " + currentUser.getRole());
                }
            }
            if(select == 3) {
                System.out.println("로그아웃 합니다.");
                currentUser = null;
            }
        }
    }
}
