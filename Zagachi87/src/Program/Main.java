/*
87. Given natural n, m.  Get the sum of the last m digits
numbers n.
*/
package Program;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Communicator communicator = new Communicator();
        Calculator calculator = new Calculator();
        int n = communicator.readMainNumber("Enter main number = ");
        int m = communicator.readCountOfLastNumbers("Enter count of last numbers = ", n);
        List<Integer> list = calculator.getLastNumbers(n, m);
        int result = calculator.sumLastNumbers(list);
        communicator.writeResult("Sum of last numbers = ", result);
        communicator.close();
    }
}