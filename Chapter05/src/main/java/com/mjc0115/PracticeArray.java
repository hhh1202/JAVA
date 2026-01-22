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

        System.out.println("검색할 문자를 입력하세요 : ");
        char ch = sc.nextLine().charAt(0);

//        String[] arr = new String;
    }
}
