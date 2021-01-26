package com.ghandi.edabit.medium;



public class isInOrderClass {
    public static boolean isInOrder(String str) {
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        String nums = "0123456789";
        boolean res = false;
        if (alp.contains(str.toLowerCase()) || nums.contains(str.toLowerCase())) {
            res = true;
        }

        return res;
    }
}
