package com.softserve.edu;
/*Natural numbers n, m are given. Get all smaller n
  natural numbers, the square of the sum of the digits of which is equal to m.*/
import com.softserve.function.Calc;
import com.softserve.function.Communicator;

public class AppCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Communicator comm = new Communicator();
        comm.print(calc.getNumbers(comm.getInput(), comm.getInput()));
    }
}
