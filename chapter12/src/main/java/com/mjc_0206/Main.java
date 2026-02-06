package com.mjc_0206;

import javax.swing.*;
import java.sql.Struct;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=============객체 동등 비교==============");
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3은 동등합니다.");
        } else {
            System.out.println("obj1과 obj3은 동등하지 않습니다..");
        }
        System.out.println();

        System.out.println("=============객체 해시코드===============");
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
        HashSet hashSet = new HashSet();

        Student s3 = new Student(1, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s4 = new Student(1, "홍길동");
        hashSet.add(s4);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s5 = new Student(2, "홍길동");
        hashSet.add(s5);
        System.out.println("저장된 객체 수: " + hashSet.size());
        System.out.println();

        System.out.println("===========객체 문자 정보============");
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
        System.out.println();

        System.out.println("===========레코드 선언==============");
        Member2 m = new Member2("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member2 m1 = new Member2("winter", "눈송이", 25);
        Member2 m2 = new Member2("winter", "눈송이", 25);
        System.out.println("m1.hashCode(): " + m1.hashCode());
        System.out.println("m2.hashCode(): " + m2.hashCode());
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println();

        System.out.println("===========콘솔 출력==========");
        try {
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.out.println("[에러 내용]");
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("==========키보드 입력===========");
        int speed = 0;
        int keyCode = 0;

        while(true) {
            if(keyCode != 13 && keyCode != 10) {
                if(keyCode == 49) {
                    speed++;
                } else if (keyCode == 50) {
                    speed--;
                } else if (keyCode == 51) {
                    break;
                }
                System.out.println("-----------------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("-----------------------------");
                System.out.println("현재 속도 = " + speed);
                System.out.print("선택: ");
            }

            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
        System.out.println();

        System.out.println("===============프로세스 종료==============");
        for(int i=0; i<10; i++) {
            System.out.println(i);
            if(i == 5) {
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }

        long time1 = System.nanoTime();
        int sum = 0;
        for(int i=1; i<=1000000; i++) {
            sum += 1;
        }
        long time2 = System.nanoTime();

        System.out.println("1~1000000까지의 합: " + sum);
        System.out.println("계산에 " + (time2-time1) + "나노초가 소요되었습니다.");
        System.out.println();

        System.out.println("============시스템 프로퍼티 읽기=============");
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

        System.out.println("-----------------------");
        System.out.println(" key:   value");
        System.out.println("-----------------------");
        Properties props =System.getProperties();
        Set keys = props.keySet();
        for(Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
        System.out.println();

        System.out.println("============String 클래스==============");
        String data = "자바";

        byte[] arr1 = data.getBytes();
        System.out.println("arr1: " + Arrays.toString(arr1));

        String str1 = new String(arr1);
        System.out.println("str1: " + str1);

        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println("arr2: " + Arrays.toString(arr2));

        String str2 = new String(arr2, "EUC-KR");
        System.out.println("str2: " + str2);
        System.out.println();

        System.out.println("===========StringBuilder 클래스=============");
        String data2 = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString();
        System.out.println(data);
        System.out.println();

        System.out.println("========StringTokenizer 클래스=============");
        String data3 = "홍길동&이수홍,박연수";
        String[] arr3 = data3.split("%|,");
        for(String token : arr3) {
            System.out.println(token);
        }
        System.out.println();

        String data4 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "\n");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}