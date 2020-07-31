package com.mx.hacker.rank.code.wars.unosquare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Round1 {

    public static void main(String[] args) {

        System.out.println(camelcase(""));

        System.out.println(bestDivisor(12));


    }

    static int camelcase(String s) {
        int numOfWords = 1;

        boolean passValidation = s.length() > 1 && s.length() < 100000;

        if (passValidation) {
            for (int i=0; i < s.length() ; i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    numOfWords += 1;
                }
            }
        }
        else {
            numOfWords = -1;
        }

        return  numOfWords;
    }


    static int bestDivisor(int n) {

        int bestDivisor = 0;

        List<String> sDivisors = new ArrayList();
        List<Integer> iDivisors = new ArrayList();

        for (int i=0; i <= n ; i++) {
            if (i%n == 0) {
                sDivisors.add(String.valueOf(i));
            }
        }

        sDivisors.stream().forEachOrdered(d -> {
            String[] sArray = d.split("");
            int divisor = 0;
            for (int i=0; i <= sArray.length; i++) {
                divisor += i;
            }

            iDivisors.add(divisor);

        });



       return Collections.max(iDivisors);
    }
}


/*
* if (map.containsKey(sArray[i])) {
                    result += 1;
                    map.remove(sArray[i]);
                }
                else {
                    map.put(sArray[i], 1);
                }
* */