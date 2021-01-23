package com.ghandi.edabit.easy;

import java.util.Locale;

public class reform_word {
    public static String getWord(String left, String right) {
        String l = left.substring(0,1).toUpperCase() + left.substring(1);
        return l + right;
    }
}
