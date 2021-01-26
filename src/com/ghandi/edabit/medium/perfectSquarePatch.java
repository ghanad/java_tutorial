package com.ghandi.edabit.medium;

public class perfectSquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] res = new int[n][n];
        for(int i=0; i <= n-1; i++){
            for (int j=0; j <= n-1; j++){
                res[i][j] = n;
            }
        }
        return res;
    }

}
