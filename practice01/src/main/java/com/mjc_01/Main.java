package com.mjc_01;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========보안코딩 문제 1번==========");

        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("비밀번호: ");
        String pw = sc.nextLine();

        AuthService_1 authService = new AuthService_1();
        boolean isLoginSuccess = authService.login(id, pw);

        if(isLoginSuccess) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
        System.out.println();

        System.out.println("==========보안코딩 문제 2번==========");
        System.out.print("아이디 입력: ");
        String id2 = sc.nextLine();

        UserService_2 userService_2 = new UserService_2();
        String role = userService_2.getUSerRole(id2);

        System.out.println("권한: " + role);
        System.out.println();

        System.out.println("==========보안코딩 문제 3번==========");
        AppService_3 appService_3 = new AppService_3();

        while(true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 로그인 2. 권한 확인 3. 종료");
            System.out.print("선택: ");
            int select = sc.nextInt();
            sc.nextLine(); // 버퍼 지우기

            if(select == 1) {
                System.out.print("아이디: ");
                String id3 = sc.nextLine();

                System.out.print("비밀번호: ");
                String pw3 = sc.nextLine();

                boolean isLoginSuccess3 = appService_3.login(id3, pw3);

                if (isLoginSuccess3) {
                    System.out.println("로그인 성공");
                } else {
                    System.out.println("로그인 실패");
                }
            } else if(select == 2) {
                System.out.print("아이디: ");
                String id3 = sc.nextLine();

                String role2 = appService_3.getUserRole(id3);
                System.out.println("권한: " + role2);
                System.out.println();

            } else if(select == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


        }

        System.out.println("==========보안코딩 문제 4번===========");
        AppService_4 appService_4 = new AppService_4();

        while(true) {
            try {
                System.out.println("====== 메뉴 ======");
                System.out.println("1. 로그인 2. 권한 확인 3. 종료");
                System.out.print("선택: ");
                int select2 = sc.nextInt();
                sc.nextLine(); //버퍼 처리!!!!

                if (select2 == 1) {
                    System.out.println("아이디: ");
                    String id4 = sc.nextLine();

                    System.out.println("비밀번호: ");
                    String pw4 = sc.nextLine();

                    boolean isLoginSuccess4 = appService_4.login(id, pw);

                    if (isLoginSuccess4) {
                        System.out.println("로그인 성공");
                    } else {
                        System.out.println("로그인 실패");
                    }
                } else if (select2 == 2) {
                    System.out.println("아이디: ");
                    String id4 = sc.nextLine();

                    String role3 = appService_4.getUserRole(id);
                    System.out.println("권한: " + role3);
                } else if (select2 == 3) {
                    System.out.println("프로그램 종료");
                    break;
                } else {
                    throw new IllegalArgumentException("잘못된 선택입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("[오류] 숫자만 입력해주세요");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("[오류] " + e.getMessage());
            }
        }
        System.out.println();
    }


}
