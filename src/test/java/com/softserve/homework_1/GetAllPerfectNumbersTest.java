package com.softserve.homework_1;

import org.junit.*;

public class GetAllPerfectNumbersTest {
    private static GetAllPerfectNumbers getAllPerfectNumbers;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        getAllPerfectNumbers = new GetAllPerfectNumbers();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Test
    public void getAllPerfectNumbers1() {
        System.out.println("\t\t@Test getAllPerfectNumbers1()");
        int actual;
        int expected;
        expected = 6;
        actual = getAllPerfectNumbers.findNumber(2, 27);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllPerfectNumbers2() {
        System.out.println("\t\t@Test getAllPerfectNumbers2()");
        int actual;
        int expected;
        expected = 28;
        actual = getAllPerfectNumbers.findNumber(7, 30);
        Assert.assertEquals(expected, actual);
    }
}
