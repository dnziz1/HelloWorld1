package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UsingFileNIO {
    static void main() {
        Path path1 = Path.of("example.txt");
        Path path2 = Path.of("data", "nested", "file.txt");
        Path path3 = Path.of("/var", "app").resolve("path3");

        // Inspect paths
        IO.println(path1.getFileName());
        IO.println(path1.getParent());
        IO.println(path1.toAbsolutePath());

        // Create a file
        // Using path 1
        try {
            createFile(path1);
            readFile(path1);
        } catch (IOException e) {
            IO.println("File path not found");
        } catch (Exception e) {
            IO.println("Unknown error.");
        }
    }

    static void createFile(Path path) throws IOException {
//        Files.createFile(path);
        Files.writeString(path, "Hello World");
        IO.println();
    }

    static void writeToFile(Path path) throws IOException {
        Files.write(path, List.of("Hello","World"));
    }

    static void readFile(Path path) throws IOException {
        String content = Files.readString(path);
        IO.println(content);
    }

    static void deleteFile(Path path) throws IOException {
        Files.deleteIfExists(path);
        IO.println("File successfully removed");
    }
}
