package com.ghandi.edabit.easy;

import static org.junit.Assert.*;
import org.junit.Test;


public class DoubleLettersTest {
    @Test
    public void test1() {
        assertEquals(true, DoubleLetters.doubleLetters("loop"));
    }

    @Test
    public void test2() {
        assertEquals(true, DoubleLetters.doubleLetters("meeting"));
    }

    @Test
    public void test3() {
        assertEquals(true, DoubleLetters.doubleLetters("yummy"));
    }

    @Test
    public void test4() {
        assertEquals(true, DoubleLetters.doubleLetters("moo"));
    }

    @Test
    public void test5() {
        assertEquals(true, DoubleLetters.doubleLetters("toodles"));
    }

    @Test
    public void test6() {
        assertEquals(true, DoubleLetters.doubleLetters("droop"));
    }

    @Test
    public void test7() {
        assertEquals(true, DoubleLetters.doubleLetters("loot"));
    }

    @Test
    public void test8() {
        assertEquals(false, DoubleLetters.doubleLetters("orange"));
    }

    @Test
    public void test9() {
        assertEquals(false, DoubleLetters.doubleLetters("munchkin"));
    }

    @Test
    public void test10() {
        assertEquals(false, DoubleLetters.doubleLetters("forestry"));
    }

    @Test
    public void test11() {
        assertEquals(false, DoubleLetters.doubleLetters("raindrops"));
    }

    @Test
    public void test12() {
        assertEquals(false, DoubleLetters.doubleLetters("gold"));
    }

    @Test
    public void test13() {
        assertEquals(false, DoubleLetters.doubleLetters("paradise"));
    }

    @Test
    public void test14() {
        assertEquals(false, DoubleLetters.doubleLetters("chicken"));
    }

    @Test
    public void test15() {
        assertEquals(true, DoubleLetters.doubleLetters("pizaa"));
    }

}