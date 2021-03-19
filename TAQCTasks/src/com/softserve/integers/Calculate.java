package com.softserve.integers;

import java.util.List;

public class Calculate {
    private int count;

    public int multiple(List<Integer> list){
        count = 0;
        for (Integer i: list) {
            if(isNegative(i)) continue;
            if(i % 3 == 0 || i % 5 == 0){
                count++;
            }
        }
        return count;
    }

    public int squaresOfEven(List<Integer> list){
        count = 0;
        for(Integer i : list){
            if(isNegative(i)) continue;
            if(Math.sqrt(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public boolean isNegative(int number){
        return number <= 0;
    }
}
