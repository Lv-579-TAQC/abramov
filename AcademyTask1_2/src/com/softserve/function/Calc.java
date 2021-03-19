package com.softserve.function;

import java.util.ArrayList;
import java.util.List;

public class Calc {private final List<Integer> SquareList = new ArrayList<>();

    public List<Integer> getNumbers(int n, int m) {
        for(int i = n; i>0; i--){
            int sum = i / 10 +  i % 10;
            int quadrat = sum*sum;
            if(quadrat == m) {
                SquareList.add(i);;
            }
        }
        return SquareList;
    }
}



