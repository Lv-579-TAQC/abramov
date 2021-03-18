import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    //A natural number n is given. Get all prime factors of this number.
    private int i;

    public TaskTwo(){}
    public TaskTwo(InterfaceTwo two) {}

    public List<Integer> simpleNaturalNumber(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            for (int j = 2; j <= number+1; j++) {
                if (number % j == 0) {
                    list.add(j);
                    number/= j;
                }
            }
        }
        System.out.println(list);
        return list;
    }
}