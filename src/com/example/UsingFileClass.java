package com.example;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileClass {
    static void main() {
        File file1 = new File("C:\\Users\\danie\\IdeaProjects\\HelloWorld1\\data\\nested.txt");
        File file2 = new File("data", "nested.txt");
        File dir = new File("logs");

        IO.println(file1.getName());
        IO.println(file1.getParent());
        IO.println(file2.getAbsolutePath());
        IO.println(file1.isAbsolute());

//        File file = new File("output.txt");
//        boolean created = file.createNewFile(); // trying to create a file in a location it doesn't exist will bring an exception

        String filename = "output.txt";
        File file = new File(filename);

        try {
            createFile(file);
            writeToFile(file);
        } catch (Exception e) {
            IO.println("File location not available.");
            // logger that captures the information in e
        }
    }

    static void createFile(File file) throws IOException {
//        File file = new File("output.txt");
        boolean created = file.createNewFile();
        IO.println(created);

        File logs = new File("logs/app");
        logs.mkdirs();
    }

    static void writeToFile(File file) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello World \n");
        }
    }
}
