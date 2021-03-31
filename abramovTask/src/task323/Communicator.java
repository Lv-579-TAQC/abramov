package task323;

import java.util.List;
import java.util.Scanner;

public class Communicator {
    Scanner sc = new Scanner(System.in);

    public void resultOut(List<Integer> list){
        for (int i:list) {
            System.out.print(i+" ");
        }
    }
    public int enterNumb(String text){ //enter n and check if n is natural number;
        int n = 0;
        String letters;
        do{
            System.out.print(text);
            letters = sc.nextLine();
            try{
                n = Integer.parseInt(letters);//convert string to number;
            }catch (Exception ignored){}
        }while (n <= 0);//if condition is true, then return to do; either go to return n;
        return n;
    }

    public void getText(String text){
        System.out.print(text);
    }
    public void close(){
        sc.close();
    }

}
