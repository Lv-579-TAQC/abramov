package Program;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public List<Integer> getCommonMultiples(int m, int n) {
        if (m < 1 || n < 1){
            System.out.println("you`r numbers are wrong!");
            return null;
        }
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i <= m * n; i += m) {
            if (i % n == 0) {
                if (i!=0) {
                    listOfNumbers.add(i);
                }
            }
        }
        return listOfNumbers;
    }
}
