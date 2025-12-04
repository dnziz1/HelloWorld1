package com.example;

import java.io.*;
import java.util.Scanner;

public class UsingFileClass {
    static void main() {
        File file1 = new File("C:\\Users\\danie\\IdeaProjects\\HelloWorld1\\data\\nested.txt");
        File file2 = new File("data", "nested.txt");
        File dir = new File("logs");

        IO.println(file1.getName());
        IO.println(file1.getParent());
        IO.println(file2.getAbsolutePath());
        IO.println(file1.isAbsolute());
        IO.println(file1.getTotalSpace());

//        File file = new File("output.txt");
//        boolean created = file.createNewFile(); // trying to create a file in a location it doesn't exist will bring an exception

        String filename = "output.txt";
        File file = new File(filename);

        try {
            createFile(file);
//            writeToFile(file);
//            appendToFile(file, "Yes another Hello World\n");
            readFileInfo(file);
            deleteFile(file);
        } catch (Exception e) {
            IO.println("File location not available.");
            // logger that captures the information in e
        }

        // Renaming a file
        /*try {
            File fileA = new File("fileA.txt");
            File fileB = new File("movetofolder/fileB.txt");
            boolean moved = fileA.renameTo(fileB);
        } catch (Exception e) {
            IO.println("File name is already taken");
        }
         */
    }

    static void createFile(File file) throws IOException {
//        File file = new File("output.txt");
        boolean created = file.createNewFile();
        IO.println(created);

//        File logs = new File("logs/app");
//        logs.mkdirs();
    }

    static void writeToFile(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Hello World \n");
        }
    }

    static void appendToFile(File file, String data) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(data);
        }
    }

    static void readFileInfo(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                IO.println(line);
            }
        }
    }

    static void deleteFile(File file) {
        Scanner reader = new Scanner(System.in);
        IO.println("Are you sure? y/n");
        String result = reader.nextLine().toLowerCase().trim();
        if (result.equals("y")) {
            file.delete();
            IO.println("File successfully deleted.");
        } else {
            IO.println("File not deleted.");
        }

    }

//    try (FileOutputStream fos = new FileOutputStream("byte-data.bin")) {
//        fos.write(new byte[]{1, 2, 3, 4});
//    }
//
//    try (FileInputStream fis = new FileInputStream("byte-data.bin")) {
//        int value;
//        while ((value = fis.read()) != -1) {
//            System.out.print(value + " ");
//        }
//    }
}
