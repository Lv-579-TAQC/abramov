package com.softserve.training;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    private final List<Integer> CubedList = new ArrayList<>();

    public List<Integer> getNumbers(int n){
        int q = 2;
        boolean check = true;
        while (check){
            int squred = q * q;
            int cubed = squred * q;
            if(cubed > n) {
                check = false;
            }
            if(n % squred == 0 && n % cubed != 0) {
                CubedList.add(q);
            }
            ++q;
        }
        return CubedList;
    }
}