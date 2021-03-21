package com.softserve.homework_1;

/*
A natural number N is given.
a) How many digits are there in N.
b) What is the sum of its numbers?
 */

public class NaturalNumber {

    public int findSumOfDigits(int number) {
        int temp, sum = 0;
        while (number != 0) {
            temp = number % 10;
            number = number / 10;
            sum += temp;
        }
        return sum;
    }

    public int numberOfDigitsInNumber(int numbers) {
        int count = 0;
        while (numbers != 0) {
            count++;
            numbers = numbers / 10;
        }
        return count;
    }
}
