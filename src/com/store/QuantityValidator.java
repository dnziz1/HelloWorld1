package com.store;

import java.util.Scanner;

public class QuantityValidator {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int quantity = -1;

        while (quantity < 0) {
            System.out.print("Enter quantity (>= 0): ");
            if (reader.hasNextInt()) {
                quantity = reader.nextInt();
            } else {
                System.out.println("Invalid input. Try again.");
            }
            reader.nextLine(); // clear buffer
        }

        System.out.println("You entered a valid quantity: " + quantity);
        reader.close();
    }
}
