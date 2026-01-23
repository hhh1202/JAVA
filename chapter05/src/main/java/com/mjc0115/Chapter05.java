package com.mjc0115;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class chapter05 {
    public void ch01() {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }

    public void ch02() {
        int[] intArray = null;
        //intArray[0] = 10;

        String str = null;
        //System.out.println("총 문자 수: " + str.length());
        System.out.println(str + " " + intArray);
    }

    public void ch03() {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }

    public void ch04() {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3가 strVar4는 문자열이 같음");
        }
    }

    public void ch05() {
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }

    public void ch06() {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }

    public void ch07() {
        String ssn = "9506241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }

    public void ch08() {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }

    public void ch09() {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }

    public void ch10() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }

    public void ch11() {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");

        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println();

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }

    public void ch12() {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }

    public void ch13() {
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        printItem(new int[]{83, 90, 87});
    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }

    public void ch14() {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println("\n");

        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println();
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + "]" + arr2[i] + ", ");
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
        }
        System.out.println();
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
        }
    }

    public void ch15() {
        int[] scores = {84, 90, 96};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }

    public void ch16() {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };
        System.out.println("1차원 배열 길이(반의 수): " + scores.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);

        System.out.println("scores[0][2]: " + scores[0][2]);
        System.out.println("scores[1][1]: " + scores[1][1]);

        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);

        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두 번째 반의 평균 점수: " + class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
    }

    public void ch17() {
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }
        System.out.println();
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int k = 0; k < mathScores[i].length; k++) {
                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]:" + englishScores[i][k]);
            }
        }
        System.out.println();

        englishScores[0][0] = 90;
        englishScores[0][1] = 90;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }

    public void ch18(){
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }

    public void ch19(){
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];
        for(int i=0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }
        for(int i=0; i<newIntArray.length; i++){
            System.out.print(newIntArray[i] + ", ");
        }
        System.out.println("");
    }

    public void ch20(){
        String[] oldStrArray = { "java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++){
            System.out.print(newStrArray[i] + ", ");
        }
        System.out.println("");
    }

    public void ch21() {
        int[] scores = { 95, 71, 84, 93, 87};
        int sum = 0;
        for(int score : scores){
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }

    public void ch22() {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(max < array[i])max = array[i];
        }
        System.out.println(max);
    }

    public void ch23() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int count = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++){
                sum += array[i][j];
                count++;
            }
        }
        int avg = sum / count;
        System.out.println("전체 합 : " + sum + ", 평균 : " + avg);
    }

    public void ch24() {
        int count = 0;
        int[] scores = new int[count];
        int max = 0;
        int sum = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in); // 메모리 사용을 최소화하자

        while(true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------");
            System.out.print("선택> ");

            int choose = sc.nextInt();

            if(choose == 1) {
                System.out.print("학생수> ");
                count = sc.nextInt();
                scores = new int[count]; // 누락한 부분
            }

            else if(choose == 2) {
                for(int i=0; i<scores.length; i++){
                    System.out.print("scores[" + i + "]: ");
                    int score = sc.nextInt();
                    scores[i] = score;
                }
            }

            else if(choose == 3){
                for(int i=0; i<scores.length; i++){
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            }
            else if(choose == 4) {
                for(int i=0; i<scores.length; i++){
                    if(max < scores[i]) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                avg = (double)sum/count;
                System.out.println("최고 점수 : " + max);
                System.out.println("평균 점수 : " + avg);
            }
            else if(choose == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    public void runArray() {
        String[] line = {"*", "**", "***", "****", "*****"};
        for (String item : line) {
            System.out.println(item);
        }
        char[][] lines = new char[5][];
//        lines[0] = new char[1];
//        lines[1] = new char[2];
//        lines[2] = new char[3];
//        lines[3] = new char[4];
//        lines[4] = new char[5];

//        for (int i = 0; i < lines.length; i++) {
//            lines[i] = new char[i + 1];
//            for (int j = 0; j < lines[i].length; j++) {
//                lines[i][j] = '*';
//            }
//        }

        for (int i = 0; i < lines.length; i++) {
            lines[i] = new char[i + 1];
            for (int j = 0; j < lines[i].length; j++) {
                lines[i][j] = '*';
            }
            System.out.println();
        }


    }

    public void ArrayExample() {
        System.out.println("01/21 과제 1-1");
        boolean[] boolArray = new boolean[10];
        for (int i = 0; i < boolArray.length; i++) {
            if (i % 2 == 0) {
                boolArray[i] = true;
                System.out.println(boolArray[i]);
            } else {
                boolArray[i] = false;
                System.out.println(boolArray[i]);
            }
        }
        System.out.println("01/21 과제 1-2");
        int[] intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            System.out.println(i + "번 index : " + intArray[i]);
        }
        System.out.println("01/21 과제 1-3");
        char[] charArray = new char[20];

        boolean[][] boolArray2 = new boolean[3][4];
        for(int i=0; i<boolArray2.length; i++){
            for(int j=0; j<boolArray2[i].length; j++){
                boolArray2[i][j] = true;
                System.out.println(i + "열 " + j + "번 : " + boolArray2[i][j]);
            }
        }
        System.out.println("01/21 과제 1-4");
        String[] StrArray = new String[50];
        for(int i=0; i<StrArray.length; i++){
            StrArray[i] = "empty";
            System.out.println(i + "번 index 원소 : " + StrArray[i]);
        }
        System.out.println("01/21 과제 2");
        int[][] intDemention2 = {
                {1, 0, 1, 0, 0, 1}
                , {1, 0, 1, 1, 0, 1}
                , {0, 1, 0, 1, 0, 0}
                , {1, 0, 0, 1, 0, 1}
                , {1, 0, 1, 0, 0, 1}
        };
        int totalZero = 0, totalOne = 0;
        for (int i = 0; i < intDemention2.length; i++) {
            for (int j = 0; j < intDemention2[i].length; j++) {
                if(intDemention2[i][j] == 0){
                    totalZero++;
                }else {
                    totalOne++;
                }
            }
        }
        System.out.println("총 0의 갯수는 : " + totalZero + " 총 1의 갯수는 : " + totalOne);

        System.out.println("01/21 과제 3번");
        char[][] chInput = {
                {'*', '*', '*', '*', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', ' ', '*', '*', '*'}
        };

        char[][] chOutput = new char[chInput[0].length][chInput.length];
        for(int row=0; row< chInput.length; row++){
            for(int col=0; col<chInput[row].length; col++){
                chOutput[col][row] = chInput[row][col];
            }
        }
        System.out.println(Arrays.toString(chOutput));
    }

    public void addArrayExample(){
        System.out.println("01/21 배열 숙성 과제 1-1");
        double[] dArray = new double[25];
        for(int r=0; r<dArray.length; r++){
            dArray[r] = Math.random() * 100; // 0.0 ~ 99.9999...
            System.out.println(r + "번째 난수 : " + dArray[r]);
        }
        System.out.println(Arrays.toString(dArray));

        System.out.println("01/21 배열 숙성 과제 1-2");
        int[] nArray = new int[25];
       for(int i=0; i<nArray.length; i++){
           nArray[i] = (int)dArray[i]; // 타입 변환 중요!!
           System.out.println(i + "번째 정수 : " + nArray[i]);
       }
        int sum = 0;
        for(int i=0; i<nArray.length; i++){
            sum += nArray[i];
        }
        int avg = (int)sum/nArray.length;
        System.out.println("전체 원소들의 총 합 : " + sum + ", 평균은 : " + avg);

        System.out.println("01/21 배열 숙성 과제 2-1");
        String[] strArray = new String[25];

//        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
//        int[][] n2Array = new int[][];

        System.out.println("01/21 배열 숙성 과제 2-3");
        char[][] chDiamond = new char[5][5];
        for(int i=0; i<chDiamond.length; i++){
            System.out.println("*");
        }
    }
}