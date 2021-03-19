package com.softserve.edu;
/*225 A natural number n is given. Get all such natural q,
  that n is divisible by q ^ 2 and not divisible by q ^ 3 */
import com.softserve.training.Calc;
import com.softserve.training.CalcCommunicator;

public class AppCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        CalcCommunicator calcCommunicator = new CalcCommunicator();
        calcCommunicator.print(calc.getNumbers(calcCommunicator.getInput()));
    }
}
