package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 15;
        double c = 1.5;

        System.out.println("Result is " + (a + b) / c);
        System.out.println("Result is " + (a + b) % c);

        byte maxByte = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(maxByte + " = Max_byte + 1");
        short minShort = (short) (Short.MIN_VALUE - 1) ;
        System.out.println(minShort + " = Min_short - 1");

        if ((a + b) % c == 0 || (a + b) / c != 0) {
            System.out.println("Hello, World!");
        }

        for (int i = 1; i <= 25; i+=5) {
            if (i % 2 == 0 ) {
                System.out.println("Number " + i + " is even");
            } else {
                System.out.println("Number " + i + " is odd");
            }
        }

        String ternary = a > 10 ? "Number is greater than 10"
                : (a > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
        System.out.println(ternary);
    }
}