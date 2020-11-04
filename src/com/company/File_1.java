package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Surface\\Desktop\\Java_koolitus\\Tasks\\Lesson3\\Tere.txt"))) {

            // read line by line
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(sb);

    }
}
