package com.bootcoding.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void test1(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {1, 2, 3, 4, 5};
        int actualSum = arraySum.getSum(nums);
        int expectedSum = 15;

        assertEquals(expectedSum, actualSum);
    }
    @Test
    public void test2(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {1, 2, 3, 4, 10};
        int actualMax = arraySum.getMax(nums);
        int expectedMax = 10;
        assertEquals(expectedMax, actualMax);


    }

}