package com.example;

public class Calculator {
    public static int getSum(int number1, int number2) {
        return number1 + number2;
    }

    public static int getSum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static int getSum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static float getSum(float number1, float number2) {
        return number1 + number2;
    }

    public static long getSum(long number1, int number2) {
        return number1 + number2;
    }

    static void main() {
        float total = getSum(1_000_000_000_000l,2);
        IO.println(total);
    }
}
