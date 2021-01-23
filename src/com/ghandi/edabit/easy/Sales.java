package com.ghandi.edabit.easy;

public class Sales {
    public static double discount(int price, int percentage) {
        int p = price * (100 - percentage);
        return p/100;
    }
}
