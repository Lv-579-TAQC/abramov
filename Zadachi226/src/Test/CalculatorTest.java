package Test;

import Program.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testGetCommonMultiples1() {  //  all is OK
        List expected = new ArrayList();
        List<Integer> actual = calculator.getCommonMultiples(6, 8);
        expected.addAll(Arrays.asList(24, 48));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetCommonMultiples2() {  //  boundary value (n < 1 (not natural))
        List expected = new ArrayList();
        List<Integer> actual = calculator.getCommonMultiples(5, 0);
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void testGetCommonMultiples3() {  //  boundary value (m < 1 (not natural))
        List expected = new ArrayList();
        List<Integer> actual = calculator.getCommonMultiples(-3, 7);
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void wrongTestGetCommonMultiples1() {  //  wrong answer
        List expected = new ArrayList();
        List<Integer> actual = calculator.getCommonMultiples(1, 2);
        expected.add(1);
        Assert.assertNotEquals(expected, actual);
    }
}