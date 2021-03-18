package Test;

import Program.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testGetMersenneNumbers1() {  // all is OK
        List expected = new ArrayList();
        List<Integer> actual = calculator.getMersenneNumbers(20);
        expected.addAll(Arrays.asList(1,3,7,15));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetMersenneNumbers2() {  // all is OK (boundary value (1))
        List expected = new ArrayList();
        List<Integer> actual = calculator.getMersenneNumbers(1);
        expected.addAll(Arrays.asList(1));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wrongTestGetMersenneNumbers1() {  // n <= 0
        List expected = new ArrayList();
        List<Integer> actual = calculator.getMersenneNumbers(0);
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void wrongTestGetMersenneNumbers2() {  // wrong answer
        List expected = new ArrayList();
        List<Integer> actual = calculator.getMersenneNumbers(5);
        expected.addAll(Arrays.asList(1, 3, 7, 15, 31, 63, 127));
        Assert.assertNotEquals(expected, actual);
    }
}