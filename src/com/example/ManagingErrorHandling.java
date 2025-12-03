package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ManagingErrorHandling {
    static void main() {
        /*
        //IO.println("Hello World"); // Missing the semicolon or misspelling the println
        Scanner reader = new Scanner(System.in);
        String strX = reader.nextLine();
        int x = Integer.parseInt(strX);
        int y = 10 / x;

        String name = null;
        if (name == null) {

        } else {
            IO.println(name.length());
        }

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            IO.println("Cannot divide by zero");
        }

        try {
            String text = Files.readString(Path.of("info.txt"));
            int value = Integer.parseInt(text);
        }
        catch (FileNotFoundException e) {
            IO.println("Files missing");
        }
        catch (NumberFormatException e) {
            IO.println("Content is not a number");
        }
        catch (IOException e) {
            IO.println("Unknown error");
            // generate a log of the issue
        }
         */

        int[] arr = new int[]{1,2,3,4,5,6,6,7};
        Scanner reader = null;
        try {
            reader = new Scanner(new File("data.txt"));
        }
        catch (FileNotFoundException e) {
            IO.println("Cannot find your file");
        }
        finally {
            if (reader != null)
                reader.close();
        }

        reader = new Scanner(System.in);
    }

    public void loadData() throws IOException {
        Files.readAllLines(Path.of("data.txt"));
    }
}
