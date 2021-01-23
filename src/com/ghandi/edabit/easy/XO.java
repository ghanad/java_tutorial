package com.ghandi.edabit.easy;

//link: https://edabit.com/challenge/bkFqwEP5Gej23didA

public class XO {
    public static boolean getXO (String str) {
        boolean res = false;
        String strUper = str.toLowerCase();
        int x = charCount(strUper, 'x');
        int o = charCount(strUper, 'o');
        if (x == o) {
            res = true;
        }
        return res;
    }

    private static int charCount (String str, char s){
        int count = 0;
        for (int i=str.length() -1 ; i >= 0 ; i--){
            if (str.charAt(i) == s){
                count += 1;
            }
        }
        return count;
    }
}
