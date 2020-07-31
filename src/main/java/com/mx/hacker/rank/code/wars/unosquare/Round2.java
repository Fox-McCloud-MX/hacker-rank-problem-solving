package com.mx.hacker.rank.code.wars.unosquare;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;

public class Round2 {

    static int[] ar = {10,20,20,10,10,30,50,10,20};
    static int n = 9;

    static String s1 = "aabbccddeefghi";
    static String s2 = "abcdefghhgfedecba";

    public static void main(String[] args) {
        //System.out.println(sockMerchant(n,ar));
        System.out.println(isValid(s2));
    }

    static int sockMerchant(int n, int[] ar) {
        int result = 0;

        HashMap<Integer, Integer> map = new LinkedHashMap();

        boolean passValidation = n > 1 && n < 100;

        for (int i=0; i < ar.length ; i++) {
            if (map.containsKey(ar[i])) {
                result += 1;
                map.remove(ar[i]);
            }
            else {
                map.put(ar[i], ar[i]);
            }
        }


        return result;
    }

    static String isValid(String s) {
        String answer = "NO";

        int result = 0;

        String en = "[a-z]+";
        HashMap<String, Integer> map = new LinkedHashMap();

        boolean passValidation = s.length() > 1 &&
                s.length() < 100000 &&
                Pattern.matches(en, s);

        String[] sArray = s.split("");

        System.out.println(passValidation);

        if (passValidation) {
            for (int i=0; i < sArray.length ; i++) {
                if (map.containsKey(sArray[i])) {
                    int d = map.get(sArray[i]);
                    map.put(sArray[i], d+=1);
                }
                else {
                    map.put(sArray[i], 1);
                }
            }
        }

        map.forEach((k,v) -> {
            System.out.println(k+" "+v);
        });

        Set<Integer> values = new HashSet<Integer>(map.values());
        boolean isUnique = values.size() == 1;

        for (int i=0; i < sArray.length ; i++) {

        }

        System.out.println(isUnique);

        if(isUnique) {
            answer = "YES";
        }

        return  answer;
    }

    static String isValid2(String s) {
        String answer = "NO";

        int result = 0;

        String en = "[a-z]+";
        HashMap<String, Integer> map = new LinkedHashMap();

        boolean passValidation = s.length() > 1 &&
                s.length() < 100000 &&
                Pattern.matches(en, s);

        String[] sArray = s.split("");



        if (passValidation) {
            for (int i=0; i < sArray.length ; i++) {
                if (map.containsKey(sArray[i])) {
                    int d = map.get(sArray[i]);
                    map.put(sArray[i], d+=1);
                }
                else {
                    map.put(sArray[i], 1);
                }
            }
        }

        Set<Integer> values = new HashSet<Integer>(map.values());
        boolean isUnique = values.size() == 1;

        if(isUnique) {
            answer = "YES";
        }

        return  answer;
    }
}
