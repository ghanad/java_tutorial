package com.ghandi.edabit.easy;

public class Stuttering {
    public static String stutter(String word) {
        String stu = word.substring(0,2);
        String finalS = stu + "... " + stu + "... " + word + "?";
        return finalS;
    }
}
