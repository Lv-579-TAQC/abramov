package main.java.ss.ita;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Communicator communicator = new Communicator();
        Calculator calculator = new Calculator();
        int numberOfTask;
        while (true) {
            communicator.info();
            numberOfTask = communicator.readNumberOfTask("Select a task number: ");
            if (numberOfTask == 87) {
                int mainNumber = communicator.readNaturalNumber("Enter main number = ");
                int lastNumbers = communicator.readCountOfLastNumbers("Enter count of last numbers = ", mainNumber);
                List<Integer> listOfLastNumbers = calculator.getLastNumbers(mainNumber, lastNumbers);
                int result = calculator.sumOfLastNumbers(listOfLastNumbers);
                communicator.writeIntResult("Sum of last numbers = ", result);
            } else if (numberOfTask == 226) {
                int firstNumber = communicator.readNaturalNumber("Enter first number : ");
                int secondNumber = communicator.readNaturalNumber("Enter second number : ");
                communicator.whiteText("Common multiples : ");
                List<Integer> listOfCommonMultiples = calculator.getCommonMultiples(firstNumber, secondNumber);
                communicator.writeListResult(listOfCommonMultiples);
            } else if (numberOfTask == 559) {
                int naturalNumber = communicator.readNaturalNumber("Enter number: ");
                communicator.whiteText("The Mersenne numbers: ");
                List<Integer> listOfMersenneNumbers = calculator.getMersenneNumbers(naturalNumber);
                communicator.writeListResult(listOfMersenneNumbers);
            } else if (numberOfTask == 999) {
                break;
            }
        }
            communicator.close();
    }
}
