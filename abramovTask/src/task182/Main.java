package task182;
//A natural number n, integers a1, ..., an are given. Find amount and quantity
//        those members of this sequence that are divisible by 5 and not divisible by 7.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Communicator communicator = new Communicator();
        Calc calk = new Calc();
        int n = communicator.getSize("Enter n = ");
        List<Integer> listOfEnterNum = communicator.getArray("Enter number = ", n);
        int sum = calk.getSum(listOfEnterNum);
        int size = calk.getSize(listOfEnterNum);
        communicator.sumOut("Sum : ", sum);
        communicator.sizeOut("Size : ",size);
        communicator.closeScanner();
    }
}
