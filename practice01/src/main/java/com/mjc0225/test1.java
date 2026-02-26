package com.mjc0225;

public class test1 {
    //1~100까지 합을 구하시오
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);

        int[] arr = {3, 6, 9, 10, 13};

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        int[] arr2 = {1, 8, 3, 12, 5, 20 ,30, 45};
        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(arr2[i] > 5) {
                count++;
            }
        }
        System.out.println(count);

    }
}
