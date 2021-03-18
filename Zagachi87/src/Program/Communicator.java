package Program;

import java.util.Scanner;

public class Communicator {
    private Scanner scanner = new Scanner(System.in);

    public int readMainNumber(String message) {
        int x = 0;
        String temp;
        do {
            System.out.print(message);
            temp = scanner.nextLine();
            try {
                x = Integer.parseInt(temp);
            }
            catch (Exception ignored){}
        }
        while (x<=0);
        return x;
    }
    public int readCountOfLastNumbers(String message, int mainNumber) {
        int x = 0;
        String temp;
        int length = String.valueOf(Math.abs(mainNumber)).length();
        do {
            System.out.print(message);
            temp = scanner.nextLine();
            try {
                x = Integer.parseInt(temp);
            }
            catch (Exception ignored) {}
        }
        while (x < 1 || x > length);
        return x;
    }

    public void writeResult(String message, int result) {
        System.out.println(message + result);
    }

    public void close(){
        scanner.close();
    }
}