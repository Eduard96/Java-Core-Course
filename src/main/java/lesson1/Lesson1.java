package lesson1;

public class Lesson1{

    public static void main(String[] args) {
        System.out.println("Hello PicsArt lessons :)");
        System.out.println("Today we are going to learn Java Primitive Data Types");
        System.out.println("Let's go :)");

        byte byteType = 77;
        System.out.println("byte = " + byteType); // 77
        byteType = 13;
        System.out.println("byte = " + byteType); // 13

        short shortType = 5;
        System.out.println("short = " + shortType); // 5
        shortType = 96;
        System.out.println("short = " + shortType); // 96

//        int shortType = 123; NO! We must write new name
        int intType = 123;
        System.out.println("int = " + intType); // 123

        long theBiggestIntegerType = 999999999999999999L;
        System.out.println("long = " + theBiggestIntegerType); // I'm lazy to write that long number here
        theBiggestIntegerType = -999999999999999999L;
        System.out.println("long = " + theBiggestIntegerType); // The same reason

        float floatType = 123.0123456789f;
        double doubleType = 123.0123456789;

        System.out.println("float = " + floatType); // 123.012344
        System.out.println("double = " + doubleType); // 123.0123456789

        boolean redOrBlue = true;
        System.out.println( "boolean = " + redOrBlue);
        redOrBlue = false;
        System.out.println("boolean = " + redOrBlue);

        char character = '♡';
        System.out.println("Many people all over the world " + character + " PicsArt");
        System.out.println("Good bye. See you in the next lesson!");
    }
}
