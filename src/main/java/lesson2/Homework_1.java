package lesson2;

public class Homework_1 {

    public static void main(String[] args) {
        /**
         * Task 1
         */
        System.out.println("********** Task 1 **********");
        int[] arr_1 = new int[]{1, 3};
        int[] arr_2 = new int[2];
        arr_2[0] = 2;
        arr_2[1] = 4;
        for (int i = 0; i < 2; i++) {
            System.out.printf("arr_1[%d] = %d\n", i, arr_1[i]);
            System.out.printf("arr_2[%d] = %d\n", i, arr_2[i]);
        }

        /**
         * Task 2
         */
        System.out.println("********** Task 2 **********");
        int[] fromOneTo1000 = new int[1000];
        for (int i = 0; i < fromOneTo1000.length; i++) {
            fromOneTo1000[i] = i + 1;
        }
        // first 10 numbers and last 10 numbers
        for (int i = 0; i < fromOneTo1000.length; i++) {
            System.out.println(fromOneTo1000[i]);
            if(i == 10) i = 990;
        }


        /**
         * Task 3
         */

        //Odd numbers cannot be negative
        // 1 and 0 aren't odd
        //So this loop I'll start with a 2
        System.out.println("********** Task 3 **********");
        for (int i = 2; i < 20; i++) {
            if(i == 2 || i == 3) System.out.println(i);
            else if(i%2 != 0 && i%3 != 0) System.out.println(i);
        }
    }
}
