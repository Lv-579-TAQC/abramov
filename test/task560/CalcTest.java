package task560;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcTest {
    Calc calculator = new Calc();

    @Test
    public void getFriendlyNumb1() { //all is OK
        List<Integer> expected = new ArrayList<>(Arrays.asList(284, 220));
        List<Integer> actual = calculator.getFriendlyNumb(200, 300);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFriendlyNumb2() {//numbers in the range from 200 to 300
        List<Integer> expected = new ArrayList<>(Arrays.asList());
        List<Integer> actual = calculator.getFriendlyNumb(301, 3000);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void getFriendlyNumb3() {//numbers in the range from 200 to 300
        List<Integer> expected = new ArrayList<>(Arrays.asList());
        List<Integer> actual = calculator.getFriendlyNumb(1, 199);
        Assert.assertEquals(expected, actual);
    }
}
