package com.store;

public class OrderService {
    static void main(String[] args) {
        double subTotal = applyDiscount(100.00, 0.10);
        IO.println(String.format("$%.2f",subTotal));
        IO.println(start());
    }

    public static double applyDiscount(double total, double discountRate) {
        return total - (total * discountRate);
    }

    public static String start() {
        return stepOne();
    }

    public static String stepOne() {
        return stepTwo();
    }

    public static String stepTwo() {
        return "Executing...";
    }
}
