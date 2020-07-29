package com.mx.hacker.rank.append.and.delete;

import java.util.regex.Pattern;

public class AppendAndDelete {

    private static String[] testOne = {"hackerhappy", "hackerrank", "9"};
    private static String[] testOTwo = {"aba", "aba", "2"};
    private static String[] testOThree = {"ashley", "ash", "2"};

    public static void main(String[] args) {

        String s = testOne[0];
        String t = testOne[1];
        int k = Integer.parseInt(testOne[2]);

        System.out.println(appendAndDelete(s,t,k));
    }

    static String appendAndDelete(String s, String t, int k) {
        String en = "[a-z]+";
        boolean pass = false;

        //validations
        pass = (s.length() >= 1 && s.length() <= 100) &&
                (t.length() >= 1 && t.length() <= 100) &&
                (k >= 1 && k <= 100) &&
                Pattern.matches(en, s) &&
                Pattern.matches(en, t);

        if (!pass) {
            return "NO";
        }

        String[] sArray = s.split("");
        String[] tArray = t.split("");

        boolean contains = s.contains(t);

        System.out.println("index of" + contains);

        return "";
    } ;
}
