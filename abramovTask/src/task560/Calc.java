package task560;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public int sumDel(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public List<Integer> getFriendlyNumb(int a, int b) {
        List<Integer> result = new ArrayList<>();
        for (int i = a; i < b; i++) {
            int sumDeli = sumDel(i);
            for (int j = a; j < i; j++) {
                if ((sumDeli == j && sumDel(j) == i)) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result;
    }
}