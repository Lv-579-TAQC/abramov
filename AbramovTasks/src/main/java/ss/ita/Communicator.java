package main.java.ss.ita;

import java.util.List;
import java.util.Scanner;

public class Communicator {

    Scanner scanner = new Scanner(System.in);

    public int readNumberOfTask(String message) {
        int number = 0;
        String forCheck;
        do {
            System.out.print(message);
            forCheck = scanner.nextLine();
            try {
                number = Integer.parseInt(forCheck);
            } catch (Exception ignored){}
            if (number != 87 && number != 226 && number != 559 && number != 999){
                System.out.println("*INVALID TASK NUMBER*");
            }
        } while (number != 87 && number != 226 && number != 559 && number != 999);
        return number;
    }

    public int readNaturalNumber(String message) {
        int number = 0;
        String forCheck;
        do {
            System.out.print(message);
            forCheck = scanner.nextLine();
            try {
                number = Integer.parseInt(forCheck);
            } catch (Exception ignored) {
            }
        }
        while (number <= 0);
        return number;
    }

    public int readCountOfLastNumbers(String message, int mainNumber) {
        int countNumbers = 0;
        String forCheck;
        int length = String.valueOf(Math.abs(mainNumber)).length();
        do {
            System.out.print(message);
            forCheck = scanner.nextLine();
            try {
                countNumbers = Integer.parseInt(forCheck);
            } catch (Exception ignored) {
            }
        }
        while (countNumbers < 1 || countNumbers > length);
        return countNumbers;
    }

    public void writeIntResult(String message, int result) {
        System.out.println(message + result);
    }

    public void writeListResult(List array) {
        for (Object o : array) {
            System.out.print(o + " ");
        }
    }

    public void whiteText(String text) {
        System.out.print(text);
    }

    public void close() {
        scanner.close();
    }
    public void info(){
        System.out.println("Enter the number of task: \n" +
                "87 - get sum of last digits of number\n" +
                "226 - get multiply digits of two numbers\n" +
                "559 - get Mersenne's numbers to a number\n" +
                "999 - close the program");
    }
}
