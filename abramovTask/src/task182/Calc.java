package task182;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            if (i % 5 == 0 && i % 7 != 0) {
                sum += i;
            }

        }
        return sum;
    }

    public int getSize(List<Integer> list) {
        int size = 0;
        for (int i : list) {
            if (i % 5 == 0 && i % 7 != 0) {
                size++;
            }
        }
        return size;
    }

}
