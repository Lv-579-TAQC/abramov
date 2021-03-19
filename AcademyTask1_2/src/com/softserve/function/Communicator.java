package com.softserve.function;

import java.util.List;
import java.util.Scanner;

public class Communicator implements Input, Print {
    private final Scanner scanner = new Scanner(System.in);

    public Communicator() { }

    @Override
    public Integer getInput() {
        int input = 0;
        System.out.println("Please enter your data:");
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
        } else {
            System.out.println("Incorrect input.");
        }
        return input;
    }

    @Override
    public void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
