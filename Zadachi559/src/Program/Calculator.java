package Program;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
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