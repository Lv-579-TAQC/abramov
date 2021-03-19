package com.softserve.integers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTest {
    private static Calculate calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculate();
    }

    @Test
    public void testMultiple1(){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-1);

        int actual = calc.multiple(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testMultiple2(){
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);

        int actual = calc.multiple(list);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiple3(){
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(5);

        int actual = calc.multiple(list);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiple4(){
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(5);

        int actual = calc.multiple(list);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiple5(){
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);

        int actual = calc.multiple(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiple6(){
        List<Integer> list = new ArrayList<>();
        list.add(-3);

        int actual = calc.multiple(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiple7(){
        List<Integer> list = new ArrayList<>();
        list.add(-5);

        int actual = calc.multiple(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiple8(){
        List<Integer> list = new ArrayList<>();
        list.add(-15);
        list.add(-5);
        list.add(-3);

        int actual = calc.multiple(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSquaresOfEven1(){
        List<Integer> list = new ArrayList<>();
        list.add(-9);
        list.add(0);

        int actual = calc.squaresOfEven(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSquaresOfEven2(){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(16);
        list.add(36);
        list.add(64);

        int actual = calc.squaresOfEven(list);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSquaresOfEven3(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int actual = calc.squaresOfEven(list);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
