package com.ghandi.edabit.medium;

public class ArrayOfMultiple {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for (int i=0; i<length; i++){
            arr[i] = (i +1) * num;
        }
        return arr;
    }
}
