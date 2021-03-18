package Program;

import java.util.List;
import java.util.Scanner;

public class Communicator {
    private Scanner scanner = new Scanner(System.in);

    public int enterNumber(String text){
        int x = 0;
        String temp;
        do {
            System.out.print(text);
            temp = scanner.nextLine();
            try {
                x = Integer.parseInt(temp);
            } catch (Exception ignored){}
        } while (x <= 0);
        return x;
    }
    public void close(){
        scanner.close();
    }

    public void outMersenneNumbers(List list){
            for (Object o: list) {
                System.out.print(o + " ");
        }
    }
    public void whiteText(String text){
        System.out.print(text);
    }
}
