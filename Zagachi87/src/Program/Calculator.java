package Program;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<Integer> getLastNumbers(int mainNumber, int countLastNumbers) {
        if (mainNumber < 0 || countLastNumbers < 1 || countLastNumbers > String.valueOf(Math.abs(mainNumber)).length()){
            System.out.println("ERROR\nYour numbers are incorrect!");
            return null;
        }
        List<Integer> list = new ArrayList();
        for (int i = 0; i < countLastNumbers; i++) {
            list.add(mainNumber % 10);
            mainNumber /= 10;
        }
        System.out.println(list);
        return list;
    }

    public int sumLastNumbers(List<Integer> list) {
        int result = 0;
        for (Integer e : list) {
            result += e;
        }
        return result;
    }
}