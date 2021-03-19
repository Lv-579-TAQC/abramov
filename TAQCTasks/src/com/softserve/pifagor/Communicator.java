package com.softserve.pifagor;

import java.util.List;
import java.util.Scanner;

public class Communicator {
    private Scanner scanner;

    public Communicator() {
        scanner = new Scanner(System.in);
    }

    public int read(String message) {
        Integer result = null;
        String temp = null;
        do {
            System.out.print(message);
            temp = scanner.nextLine();
            try {
                if(Integer.valueOf(temp) <= 0) throw new Exception();
                result = Integer.valueOf(temp);
            } catch (Exception e) {
                System.out.println("Please repeat;");
            }
        } while (result == null);
        return result;
    }

    public void close() {
        scanner.close();
    }

    public void printResult(List<Triplet> list){
        for (Triplet t: list) {
            System.out.println(t.toString());
        }
    }
}
