package lesson2;

public class Homework_3 {

    public static void main(String[] args) {
        /**
         * Task 7
         */
        System.out.println("********** Given an integer, 0< N < 21 , print its first 10 multiples. **********");

        int N = 2;
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
    }
}
