package task323;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public List<Integer> getMutuallySimple(int n) {
        List<Integer> list = new ArrayList<>();
        int a, b;
        for (int i = 1; i < n; i++) {
            a = i;
            b = n;
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            if (a == 1) {
                list.add(i);
            }
        }
        return list;
    }

}
