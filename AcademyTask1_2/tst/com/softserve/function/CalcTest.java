
package com.softserve.function;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalcTest {
    private static Calc calc;

    public CalcTest() {
        calc = new Calc();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown() ");
    }

    @Test
    public void getNumbersTest1() {
        System.out.println("\t\tgetNumbersTest1()");
        System.out.println("@Test getNumbers(int n)");
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(70);
        expectedList.add(61);
        expectedList.add(52);
        expectedList.add(43);
        expectedList.add(34);
        expectedList.add(25);
        expectedList.add(16);
        expectedList.add(7);
        List<Integer> actualList = calc.getNumbers(81, 49);

        Assert.assertEquals(expectedList, actualList);

    }
    @Test
    public void getNumbersTest2() {
        System.out.println("\t\tgetNumbersTest2()");
        System.out.println("@Test getNumbers(int n)");
        List<Integer> expectedList = new ArrayList<>();
        List<Integer> actualList = calc.getNumbers(81, 48);
        Assert.assertEquals(expectedList, actualList);

    }
}
