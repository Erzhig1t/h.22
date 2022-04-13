package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try (FileWriter fileWriter = new FileWriter("alphabet and numbers.txt")) {
            fileWriter.write("a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z ");
            fileWriter.write("0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader reader = new FileReader("alphabet and numbers.txt")) {

            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

