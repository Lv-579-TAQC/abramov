package task182;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CalcTest {
    Calc calk = new Calc();

    @Test
    public void getSum1() {//not natural
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(0));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSum2() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSum3() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(-1));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSum4() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(35));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSum5() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(-35));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSum6() {//all is OK
        int expected = 35;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 13, 14, 5, 16, 7, 30));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSum7() {//all is OK
        int expected = -35;
        List<Integer> list = new ArrayList<>(Arrays.asList(-1, -12, -13, -14, -5, -16, -7, -30));
        int actual = calk.getSum(list);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getSum8() {//n up to 35
        int expected = 5;
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 75, 100));
        int actual = calk.getSum(list);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void getSum9() {//n down to -35
        int expected = -5;
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -75, -100));
        int actual = calk.getSum(list);
        Assert.assertNotEquals(expected, actual);
    }


    @Test
    public void getSize1() {//not natural
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(0));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize2() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize3() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(-1));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize4() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(35));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize5() {//all is OK
        int expected = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(-35));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize6() {//all is OK
        int expected = 2;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 13, 14, 5, 16, 7, 30));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSize7() {//all is OK
        int expected = 2;
        List<Integer> list = new ArrayList<>(Arrays.asList(-1, -12, -13, -14, -5, -16, -7, -30));
        int actual = calk.getSize(list);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getSize8() {//n up to 35
        int expected = 1;
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 75, 100));
        int actual = calk.getSize(list);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void getSize9() {//n down to -35
        int expected = 1;
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -75, -100));
        int actual = calk.getSize(list);
        Assert.assertNotEquals(expected, actual);
    }

}
