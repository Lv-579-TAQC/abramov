package main.java.ss.ita;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<Integer> getLastNumbers(int mainNumber, int countLastNumbers) {
        if (mainNumber < 0 || countLastNumbers < 1 || countLastNumbers > String.valueOf(Math.abs(mainNumber)).length()){
            System.out.println("ERROR\nYour numbers are incorrect!");
            return null;
        }
        List<Integer> listOfLastNumbers = new ArrayList();
        for (int i = 0; i < countLastNumbers; i++) {
            listOfLastNumbers.add(mainNumber % 10);
            mainNumber /= 10;
        }
        return listOfLastNumbers;
    }
    public int sumOfLastNumbers(List<Integer> list) {
        int result = 0;
        for (Integer e : list) {
            result += e;
        }
        return result;
    }
    public List<Integer> getCommonMultiples(int firstNumber, int secondNumber) {
        if (firstNumber < 1 || secondNumber < 1){
            System.out.println("you`r numbers are wrong!");
            return null;
        }
        List<Integer> listOfCommonMultiples = new ArrayList<>();
        for (int i = 0; i <= firstNumber * secondNumber; i += firstNumber) {
            if (i % secondNumber == 0) {
                if (i!=0) {
                    listOfCommonMultiples.add(i);
                }
            }
        }
        return listOfCommonMultiples;
    }
    public List<Integer> getMersenneNumbers(int number){
        if (number <= 0){
            System.out.println("Wrong number!");
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int sum = 1;
        boolean check = true;
        while (check){
            sum *= 2;
            if (sum <= number + 1) {
                list.add(sum - 1);
            }
            else {
                check = false;
            }
        }
        return list;
    }
}
