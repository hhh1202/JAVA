package com.mjc0115;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
    public void ex01() {
//    길이가 10 인 배열을 선언하고 1 부터 10 까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("연습 문제 1번");
        System.out.println(Arrays.toString(arr));
    }
//    길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
    public void ex02() {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = 10 - i;
        }
        System.out.println("연습 문제 2번");
        System.out.println(Arrays.toString(arr));
    }
//    사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
    public void ex03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("연습 문제 3번");
        System.out.print("양의 정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];  // 입력을 받기 위해서는 변수를 (타입형에 맞게)선언 후 배열 선언할 때 마지막에 넣기!!!
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
//    길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요
    public void ex04() {
        System.out.println("연습 문제 4번");
        String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(arr[1]);
    }
//    문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
    public void ex05(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.nextLine().charAt(0);

        char[] arr = new char[str.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }

        int count = 0;
        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ch){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\ni의 개수 : " + count);
    }
//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
    public void ex06() {
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner sc = new Scanner(System.in);

        System.out.println("0~6 사이 숫자 입력 : " );
        int num = sc.nextInt();

        if(num >= 0 && num < 7) {
            System.out.println(week[num]);
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        sc.close();
        }
//    사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
        public void ex07() {

        }
}
