package com.mjc.personal_project;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Subject sj = new Subject();
        Scanner sc = new Scanner(System.in);

        st.login();
        sj.calculator();

    }
}