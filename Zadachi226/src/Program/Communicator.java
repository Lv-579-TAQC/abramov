package Program;

import java.util.List;
import java.util.Scanner;

public class Communicator {
    private Scanner scanner = new Scanner(System.in);

    public int getNumber(String text){
        int x = 0;
        String temp;
        do {
            System.out.print(text);
            temp = scanner.nextLine();
            try {
                x = Integer.parseInt(temp);
            } catch (Exception ignoreg){}
        } while (x<=0);
        return x;
    }
    public void close(){
        scanner.close();
    }
    public void outputTheResult(List array) {
        for (Object o: array) {
            System.out.print(o + " ");
        }
    }
    public void whiteText(String text){
        System.out.print(text);
    }
}