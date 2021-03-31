package task182;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Communicator {
    Scanner sc = new Scanner(System.in);

    public int getSize(String text) {
        int n = 0;
        String letters;
        do {
            System.out.print(text);
            letters = sc.nextLine();
            try {
                n = Integer.parseInt(letters);
            } catch (Exception ignored) {
            }
        } while (n <= 0);//if condition is true, then return to do; either go to return n;
        return n;
    }

    public List<Integer> getArray(String text, int num) {

        List<Integer> list = new ArrayList<>();
        int x = 0;
        String letters;
        for (int i = 0; i < num; i++) {
            do {
                System.out.print(text);
                letters = sc.nextLine();
                try {
                    x = Integer.parseInt(letters);
                } catch (Exception ignored) {
                }
            }while (x % 1 != 0 ); //if condition is true, then return to do; either go to return n;
            list.add(x);
        }
        return list;
    }



    public void sumOut(String text, int x) {
        System.out.println(text + " " + x);
    }

    public void sizeOut(String text, int y) {
        System.out.print(text + " " + y);
    }

    public void closeScanner() {
        sc.close();
    }
}
