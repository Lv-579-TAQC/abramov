import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskThree {
    public TaskThree(){}
    public TaskThree(InterfaceThree three) {
    }

    /*
        A natural number n is given. Among the numbers 1, ..., n find all
        those, the record of which coincides with the last digits of their record
        square (such as 5 = 25 6 = 36, 25 = 625, etc.).
         */
    public List<Integer> enterSquareNumber(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (i == i * i % (int) (Math.pow(10, Math.floor(Math.log10(i)) + 1))) {
                list.add(i);
            }
        }
        return list;
    }
}

