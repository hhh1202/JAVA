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

        int[] arr3 = {3, 8, 15, 6, 2, 11};
        int max2 = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr3[i]%2 == 0 && arr3[i] > max2){
                max2 = arr3[i];
            }
        }
        System.out.println(max2);

        int[] arr4 = {15,13,4,2,5,6,735,23};
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<arr4.length; i++){
            if(arr4[i]%2==1 && arr4[i] < min2) {
                min2 = arr4[i];
            }
        }
        System.out.println(min2);
    }
}
