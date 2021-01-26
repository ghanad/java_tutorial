package com.ghandi.edabit.easy;

public class DoubleLetters {
    public static boolean doubleLetters(String word) {
        boolean res = false;
        try {
            for (int i=0 ; i <= word.length() -1  ; i++){
                if (word.charAt(i) == word.charAt(i+1)){
                    res = true;
                }
            }
        }
        catch (Exception e){}
        return res;
    }
}
