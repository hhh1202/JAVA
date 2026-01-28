package com.mjc.personal_project;

import java.util.Scanner;

public class Student {
    String studentId;
    String name;
    String department ;
    Scanner sc = new Scanner(System.in);

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    void login() {
        System.out.print("학번을 입력하세요 : ");
        studentId = sc.nextLine();
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("과를 입력하세요 : ");
        department = sc.nextLine();
    }

}
