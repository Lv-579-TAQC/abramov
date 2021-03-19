package com.softserve.pifagor;

import java.util.List;

/*
    A natural number n is given. Get all Pythagorean triples of natural numbers,
    each of which does not exceed n, i.e.,
    all triples of natural numbers a, b, c such that a2 + b2 = c2
    (a ≤ b ≤ c ≤ n).
 */

public class Main {
    public static void main(String[] args) {
        Pifagor pifagor = new Pifagor();
        Communicator communicator = new Communicator();
        int n = communicator.read("n = ");

        List<Triplet> res = pifagor.triplets(n);
        communicator.printResult(res);
        communicator.close();
    }
}
