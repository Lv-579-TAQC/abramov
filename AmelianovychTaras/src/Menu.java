import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class Menu {
   public void startOfProgram() throws IOException {
       int n;
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       ConsoleReader cr = new ConsoleReader();
       System.out.println("Task 224 : A natural number n is given. Get all its natural dividers.");
       System.out.println("Task 325 : A natural number n is given. Get all prime factors of this number.");
       System.out.println("Task 561 : A natural number n is given. Among the numbers 1, ..., n find all\n" +
               "        those, the record of which coincides with the last digits of their record\n" +
               "        square (such as 5 = 25 6 = 36, 25 = 625, etc.).");
        do {
            System.out.println("Please enter a number of a task. Press 0 for exit");
            n = Integer.parseInt(bf.readLine());
            switch (n){
                case 224:
                    TaskOne t1 = new TaskOne();
                    System.out.println(t1.naturalNumber(cr.readNaturalNumber(bf)));
                    break;
                case 325:
                    TaskTwo t2 = new TaskTwo();
                    t2.simpleNaturalNumber(cr.readNaturalNumber(bf));
                    break;
                case 561:
                    TaskThree t3 = new TaskThree();
                    System.out.println(t3.enterSquareNumber(cr.readNaturalNumber(bf)));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error, invalid option");
            }
        }while (n!=0);
   }
}
