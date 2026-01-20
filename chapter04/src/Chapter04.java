import java.util.Scanner;
public class Chapter04 {
    public void test1() {
        String grade = "B";
        int score1 = 0;

        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);

        int score2 = switch(grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
    }

    public void test2() {
        int even = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                even += i;
            }
        }
        System.out.println("3의 배수 총합은: " + even);

    }

    public void test3() {
    while (true) {
        int num1 = (int)(Math.random()*6 + 1);
        int num2 = (int)(Math.random()*6 + 1);

        if((num1==1 && num2==4) || (num1==2 && num2 == 3) || (num1==3 && num2==2) || (num1==4 && num2==1)) {
            System.out.println("first dice: " + num1);
            System.out.println("second dice: " + num2);
            break;
        }else{
            System.out.println("first dice: " + num1);
            System.out.println("second dice: " + num2);
        }
    }
    }

    public void test4() {
        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++){
                if(4*x + 5*y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }

    public void test5() {
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    Scanner scanner = new Scanner(System.in); // Scanner 생성
    public void test6() {
        int count = 0;
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
            System.out.println("선택> ");
            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                System.out.println("예금액> ");
                String strNum2 = scanner.nextLine();
                int value = Integer.parseInt(strNum2);
                count += value;
            } else if(strNum.equals("2")) {
                System.out.println("출급액> ");
                String strNum3 = scanner.nextLine();
                int value2 = Integer.parseInt(strNum3);
                count -= value2;
            } else if(strNum.equals("3")) {
                System.out.println("잔고> " + count);
            }else if(strNum.equals("4")) {
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
