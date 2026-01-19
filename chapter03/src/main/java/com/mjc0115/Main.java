package com.mjc0115;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Chapter03 C03 = new Chapter03();
        C03.Third01();
        System.out.println("===========02==========");
        C03.Third02();
        System.out.println("===========03==========");
        C03.Third03();
        System.out.println("===========06 비교 연산자==========");
        C03.Third06();
        System.out.println("===========07 논리 연산자==========");
        C03.Third07();
        System.out.println("===========08 비트 논리 연산자==========");
        C03.Third08();
        System.out.println("===========09==========");
        C03.Third09();
        System.out.println("===========10==========");
        C03.Third10();
        System.out.println("===========11==========");
        C03.Third11();

        Equation Equ = new Equation();
        System.out.println("2x + 8 = 0의 해, x는 " + Equ.EquationFirst(2,8));
        System.out.println("5x + 30 = 0의 해, x는 " + Equ.EquationFirst(5, -30));
        System.out.println("5x + 30 = 0의 해, x는 " + Equ.EquationFirst(7, 49));

        System.out.println("===========test1===========");
        Equ.test1();
        System.out.println("===========test2===========");
        Equ.test2();
        System.out.println("===========test3===========");
        Equ.test3();
        System.out.println("===========test4===========");
        Equ.test4();
        System.out.println("===========test5===========");
        Equ.test5();
        System.out.println("===========test6===========");
        Equ.test6();
        System.out.println("===========test7===========");
        Equ.test7();
    }
}
