/*
226. Natural numbers m, n.  Get them all
natural common multiples less than m*n.
*/
package Program;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Communicator communicator = new Communicator();
        Calculator calculator = new Calculator();
        int m = communicator.getNumber("Enter first number : ");
        int n = communicator.getNumber("Enter second number : ");
        communicator.whiteText("Common multiples : ");
        List list = calculator.getCommonMultiples(m, n);
        communicator.outputTheResult(list);
        communicator.close();
    }
}
