package com.softserve.pifagor;

import java.util.*;

public class Pifagor {

    public List<Triplet> triplets(int n){
        List<Triplet> result = new ArrayList<>();

        if(!checkNumber(n)) {
            System.out.println("No triplets");
        }

        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                for(int c = 1; c <= n; c++){
                    if(a < b && b < c && (Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2))){
                        result.add(new Triplet(a,b,c));
                    }
                }
            }
        }
        return result;
    }

    public boolean checkNumber(int n){
        return n >= 5;
    }
}
