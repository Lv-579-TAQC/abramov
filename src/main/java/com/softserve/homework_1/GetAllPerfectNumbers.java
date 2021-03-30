package com.softserve.homework_1;

/*
 * Find a natural number
 * */

public class GetAllPerfectNumbers {
    public int findNumber(int number, int value) {

        for (; number < value; number++) {
            int factorSum = 0;
            for (int possibleFactor = 1; possibleFactor <= number / 2; possibleFactor++) {
                if (number % possibleFactor == 0) {
                    factorSum = possibleFactor + factorSum;
                }
            }
            if (factorSum == number) {
                return number;
            }
        }
        return number;
    }
}