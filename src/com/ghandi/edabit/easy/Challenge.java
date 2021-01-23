package com.ghandi.edabit.easy;

public class Challenge {
    public static int equal(int a, int b, int c) {
        int t = 0;
        if (a == b){
            t += 1;
        }
        if (b == c){
            t += 1;
        }
        if (a == c){
            t += 1;
        }
        if (t == 1){
            t +=1;
        }
        return t;

    }
}
