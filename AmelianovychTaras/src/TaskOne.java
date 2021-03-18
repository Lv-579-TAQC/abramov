import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class TaskOne implements InterfaceOne {
    //A natural number n is given. Get all its natural dividers.
    private int i;
    public TaskOne(){}

    public TaskOne(InterfaceOne one) {
    }

    public List<Integer> naturalNumber(int n){
        List<Integer> ls = new ArrayList<>();
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                ls.add(i);
            }
        }
        return ls;
    }
}