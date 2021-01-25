package com.ghandi.edabit.easy;

public class WholeNumber {
    public static boolean isAvgWhole(int[] arr) {
        boolean res = false;
        double avgg = arr_avg(arr);
        if (Math.ceil(avgg) == avgg){
            res = true;
        }

        return res;
    }

    public static double arr_avg(int[] arr){
        int sum = 0;
        for (int x: arr){
            sum += x;
        }
        return (double) sum / arr.length;
    }
}
