//Natural number n is given. Find number with max sum of dividers [1...10000]

public class Main {

    public static void main(String[] args) throws CalcExeption {


        Communicator communicator = new Communicator();
        Calc calc = new Calc();
        int n = communicator.readInputNumber();
        communicator.getText("Number with max sum of dividers is  : ");
        int number = calc.numberWithMaxSumOfDividers(n);
        int message = 0;
        try {
            message = Calc.numberWithMaxSumOfDividers(n);
        } catch (CalcExeption e) {
            System.out.println(e.getMessage());
        }
        communicator.resultOut(message);
        communicator.closeScanner();
    }


}












