package com.example;

import java.util.Random;
import java.util.Scanner;

public class UsingAPIs {
    static void main() {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int value = rand.nextInt(100); // numbers between 0 - 100
        IO.println(value);
    }
}
