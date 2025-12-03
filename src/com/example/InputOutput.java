package com.example;

import java.util.Scanner;

public class InputOutput {
    static void main() {
        Scanner reader = new Scanner(System.in);
        IO.println("Enter age: ");
        int age = reader.nextInt();
        reader.nextLine(); // Clears the buffer, otherwise kaboom blamoo
        IO.print("Enter name: ");
        String name = reader.nextLine();

        IO.println(name + " " + age);
    }
}
