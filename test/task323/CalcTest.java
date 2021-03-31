package task323;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcTest {
    Calc calculator = new Calc();

    @Test
    public void getMutuallySimple1() { //all is OK
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 7, 9));
        List<Integer> actual = calculator.getMutuallySimple(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMutuallySimple2() {// n is not natural(<1)
        List<Integer> expected = new ArrayList<>(Arrays.asList(0));
        List<Integer> actual = calculator.getMutuallySimple(0);
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getMutuallySimple3() { //all is OK
        List<Integer> expected = new ArrayList<>(Arrays.asList());
        List<Integer> actual = calculator.getMutuallySimple(1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getMutuallySimple4() {//size up to 10
        List<Integer> expected = new ArrayList<>(Arrays.asList());
        List<Integer> actual = calculator.getMutuallySimple(15);
        Assert.assertNotEquals(expected, actual);

    }
}
