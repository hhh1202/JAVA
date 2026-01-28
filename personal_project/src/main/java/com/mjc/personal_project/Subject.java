package com.mjc.personal_project;

import java.util.Arrays;

public class Subject extends Student{
//    String list[] = new String[10];
    int count = 1, score, choice;
    String subject, subject_choice;

    void calculator() {
        while(true) {
            String list[] = new String[count];
            System.out.print("1.수강 과목 입력 | 2.성적입력 | 3.종료 ");
            System.out.print("\n선택 : ");
            choice = sc.nextInt();
            sc.nextLine(); // 이거 왜 이렇게 해야하는거??????

            if(choice == 1){
                System.out.print("과목을 입력하세요 : ");
                subject = sc.nextLine();
                list[count] = subject;
                count++;
            }
            else if(choice == 2){
                    System.out.println(Arrays.toString(list));
                    System.out.print("성적을 입력할 과목을 선택하세요 : ");
                    subject_choice = sc.nextLine();
                    System.out.print("성적을 입력하세요 : ");
                    score = sc.nextInt();
            }else if(choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}