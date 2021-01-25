package com.ghandi.edabit.easy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class WholeNumberTest {
    @Test
    public void test1(){
        assertThat(WholeNumber.isAvgWhole(new int[]{3, 5, 9}), is(false));
    }

    @Test
    public void test2() {
        assertThat(WholeNumber.isAvgWhole(new int[]{1, 1, 1, 1}), is(true));
    }

    @Test
    public void test3() {
        assertThat(WholeNumber.isAvgWhole(new int[]{1, 2, 3, 4, 5}), is(true));
    }

    @Test
    public void test4() {
        assertThat(WholeNumber.isAvgWhole(new int[]{5, 2, 4}), is(false));
    }

    @Test
    public void test5() {
        assertThat(WholeNumber.isAvgWhole(new int[]{11, 22}), is(false));
    }

    @Test
    public void test6() {
        assertThat(WholeNumber.isAvgWhole(new int[]{4, 1, 7, 9, 2, 5, 7, 2, 4}), is(false));
    }

}