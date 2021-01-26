package com.ghandi.edabit.medium;

import static org.junit.Assert.*;
import org.junit.Test;


public class isInOrderClassTest {
    @Test
    public void test1(){
        assertEquals(true, isInOrderClass.isInOrder("abc"));
    }
    @Test
    public void test2(){
        assertEquals(false,  isInOrderClass.isInOrder("edabit"));
    }
    @Test
    public void test3(){
        assertEquals(true, isInOrderClass.isInOrder("xyz"));
    }
    @Test
    public void test4(){
        assertEquals(true, isInOrderClass.isInOrder("xyz"));
    }
    @Test
    public void test5(){
        assertEquals(true, isInOrderClass.isInOrder("123"));
    }
    @Test
    public void test6(){
        assertEquals(false, isInOrderClass.isInOrder("321"));
    }

}