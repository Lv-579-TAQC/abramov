package task560;

import java.util.List;
//Two natural numbers are called friendly if each of them is equal to the sum of all divisors of the other, except for itself
//this number. Find all pairs of friendly numbers between 200 and 300.
public class Main {
    public static void main(String[] args) {
        Communicator communicator = new Communicator();
        Calc calc = new Calc();
        List<Integer> listOfFriendNumb = calc.getFriendlyNumb(200,300);
        communicator.resOut(listOfFriendNumb);

    }
}
