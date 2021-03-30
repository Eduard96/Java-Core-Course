package lesson2;

public class Homework_2 {

    public static void main(String[] args) {
        int[] fromOneTo1000 = new int[1000];
        for (int i = 0; i < fromOneTo1000.length; i++) {
            fromOneTo1000[i] = i + 1;
        }

        /**
         * Task 4
         */
        System.out.println("********** Task 4 **********");
        for (int value : fromOneTo1000) {
            if(value % 5 == 0) System.out.println(value);
        }

        /**
         * Task 5
         */
        System.out.println("********** Task 5 **********");
        for (int value : fromOneTo1000) {
            if(value > 24.12 && value < 467.23)
                System.out.println(value);
        }

        /**
         * Task 6
         */
        System.out.println("********** Task 6 **********");
        int dividedBy2Counter = 0;
        for (int value : fromOneTo1000) {
            if(value % 2 == 0) dividedBy2Counter++;
        }
        System.out.printf("%d <- quantity of numbers which divided by 2 ", dividedBy2Counter);
    }
}
