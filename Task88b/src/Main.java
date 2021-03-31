//Natural n is given. Find reverse n.

public class Main {

    public static void main(String[] args) throws CalcExeption {


        Communicator communicator = new Communicator();
        Calc calc = new Calc();
        int n = communicator.readInputNumber();
        communicator.getText("Reverse number: ");
        int number  = calc.reverseInputNumber(n);
        int message = 0;
        try {
            message = Calc.reverseInputNumber(n);
        } catch (CalcExeption e) {
            System.out.println(e.getMessage());
        }
        communicator.resultOut(message);
        communicator.closeScanner();
    }


}







