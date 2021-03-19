package com.softserve.integers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWriter {
    private Scanner scanner;

    public ListWriter() {
        scanner = new Scanner(System.in);
    }

    public List<Integer> write(String message) {
        List<Integer> result = new ArrayList<>();
        String temp = null;

        System.out.println("To finish writing press /");

        do {
            System.out.print(message);
            temp = scanner.nextLine();
            try {
                if(Integer.valueOf(temp) <= 0) throw new Exception();
                result.add(Integer.valueOf(temp));
            } catch (Exception e) {
                System.out.println("Please repeat;");
            }
        } while (!temp.equals("/"));

        return result;
    }

    public void close() {
        scanner.close();
    }
}
