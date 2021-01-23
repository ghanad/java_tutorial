package com.ghandi.edabit.easy;

public class ReverseOrder {
    public static String reverse(final String str) {
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
