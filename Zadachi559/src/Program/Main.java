/*
559. A natural number n is given.  Find all smaller n numbers
Mersenne.  (A prime number is called a Mersenne number if it is
can be represented as 2 ^ p - 1, where p is also a prime number.)
*/
package Program;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Communicator communicator = new Communicator();
        Calculator calculator = new Calculator();
        int n = communicator.enterNumber("Enter number: ");
        communicator.whiteText("The Mersenne numbers: ");
        List<Integer> list = calculator.getMersenneNumbers(n);
        communicator.outMersenneNumbers(list);
        communicator.close();
    }
}