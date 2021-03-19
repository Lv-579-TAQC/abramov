
package com.softserve.training;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CalcTest {
    private static Calc calc;

    public CalcTest(){
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
    public void Calc1() {
        System.out.println("@Test getNumbers(int n)");
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);
        List<Integer> actualList = calc.getNumbers(36);

        Assert.assertEquals(expectedList, actualList);
    }
    @Test
    public void Calc2() {
        System.out.println("@Test getNumbers(int n) on less then ten");
        List<Integer> expectedList = new ArrayList<>();
        List<Integer> actualList = calc.getNumbers(81);

        Assert.assertEquals(expectedList, actualList);
    }
    @Test
    public void Calc3() {
        System.out.println("@Test getNumbers(int n) on less then ten");
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);
        List<Integer> actualList = calc.getNumbers(9999);

        Assert.assertEquals(expectedList, actualList);
    }
}
