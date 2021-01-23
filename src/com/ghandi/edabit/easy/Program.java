package com.ghandi.edabit.easy;

public class Program {
    public static boolean changeEnough(int[] change, double amountDue) {
        double sum = 0;
        boolean flag = false;
        sum += (change[0] * 0.25);
        sum += (change[1] * 0.1);
        sum += (change[2] * 0.05);
        sum += (change[3] * 0.01);

        if (sum >= amountDue){
            flag = true;
        }
        return flag;


    }
}
