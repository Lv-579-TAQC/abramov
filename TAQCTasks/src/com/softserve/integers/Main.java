package com.softserve.integers;

import java.util.ArrayList;
import java.util.List;

/*
   A sequence of natural numbers is given. Determine the number of members of the sequence:
   b) multiples of 3 and not multiples of 5;
   c) which are squares of even numbers;
 */

public class Main {
    public static void main(String[] args) {

        ListWriter listWriter = new ListWriter();
        Calculate c = new Calculate();
        List<Integer> list = listWriter.write("Add number to list: ");

        System.out.println("Number of multiples: " + c.multiple(list));
        System.out.println("Number of squares of even numbers: " + c.squaresOfEven(list));

        listWriter.close();
    }
}
