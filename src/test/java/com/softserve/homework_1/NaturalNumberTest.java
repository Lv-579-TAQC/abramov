package com.softserve.homework_1;

import org.junit.*;

public class NaturalNumberTest {
    private static NaturalNumber naturalNumber;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        naturalNumber = new NaturalNumber();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Test
    public void testSumOfDigits() {
        System.out.println("\t\t@Test testSumOfDigits()");
        int actual;
        int expected;
        expected = 26;
        actual = naturalNumber.findSumOfDigits(8657);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfDigits_1() {
        System.out.println("\t\t@Test testSumOfDigits_1()");
        int actual;
        int expected;
        expected = 24;
        actual = naturalNumber.findSumOfDigits(2589);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testNumberOfDigitsInNumber() {
        System.out.println("\t\t@Test testNumberOfDigitsInNumber()");
        int actual;
        int expected;
        expected = 3;
        actual = naturalNumber.numberOfDigitsInNumber(252);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAmountOfDigits1() {
        System.out.println("\t\t@Test testAmountOfDigits1()");
        int actual;
        int expected;
        expected = 5;
        actual = naturalNumber.numberOfDigitsInNumber(45875);
        Assert.assertEquals(expected, actual);
    }
}