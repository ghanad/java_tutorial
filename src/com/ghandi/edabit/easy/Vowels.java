package com.ghandi.edabit.easy;

//link: https://edabit.com/challenge/GBKphScsmDi9ek3ra

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i=str.length() -1 ; i >=0 ; i--){
            switch (str.charAt(i)){
                case 'a':
                    vowelsCount++;
                case 'e':
                    vowelsCount++;
                case 'i':
                    vowelsCount++;
                case 'o':
                    vowelsCount++;
                case 'u':
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }
}