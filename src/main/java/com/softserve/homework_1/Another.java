package com.softserve.homework_1;

public class Another {

    public static void main(String[] args) {

//        int possibleFactor;
//        int factorSum = 0;
//        int value = 30;
//
//
//        for (int n = 2; n < value; n++) {
//            factorSum = 0;
//            for (possibleFactor = 1; possibleFactor <= n / 2; possibleFactor++) {
//                if (n % possibleFactor == 0) {
//                    factorSum = possibleFactor + factorSum;
//                }
//            }
//            if (factorSum == n) {
//                System.out.println(n);
//            }
//        }

        int count = 0, temp, sum = 0, number = 25859;
        while (number != 0) {
            temp = number % 10;
            count++;
            number = number / 10;
            sum += temp;
        }
        System.out.println("Sum of all " + sum);
       System.out.println("Number of digits " + count);

    }
}
















//        while (number_1 != 0) {
//            r = r * 10;
//            r = r + number_1 % 10;
//            number_1 = number_1 / 10;
//        }

