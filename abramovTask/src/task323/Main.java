package task323;
import java.util.List;

//A natural number n is given.
//Get all natural numbers less than n and mutually simple with n.

public class Main {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        Communicator communicator = new Communicator();
        int n = communicator.enterNumb("Enter your number : ");
        List<Integer> list = calculator.getMutuallySimple(n);
        communicator.getText("Your mutually simple numbers : ");
        communicator.resultOut(list);
        communicator.close();
    }
}
