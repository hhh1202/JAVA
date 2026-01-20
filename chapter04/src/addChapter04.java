public class addChapter04 {
    public void test2() {
        int even = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                even += i;
            }
        }
        System.out.println("3의 배수 총합은: " + even);

    }
    public void test1() {
        int i = 0, sum = 0;
//        while(i<=100) {
//            i++;
//            if(i % 3 == 0) {
//                sum += i;
//            }
//        }

        do {
            if(i % 3 == 0) {
                sum += i;
            }
            i++;
        }
            while (i<=100) ;
        System.out.println(sum);
    }
}
