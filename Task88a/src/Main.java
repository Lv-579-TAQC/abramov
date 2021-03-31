//Natural n is given. Find if n^2 has 3.

public class Main {
    public static void main(String[] args) {

        Communicator communicator = new Communicator();
        Calc calc = new Calc();
        int n = communicator.readInputNumber();
        String message = null;
        try {
            message = Calc.is3ExistInNumber(n);
        } catch (CalcExeption e) {
            System.out.println(e.getMessage());
        }
        communicator.resultOut(message);
        communicator.closeScanner();
    }
}


