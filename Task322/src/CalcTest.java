
import org.junit.*;
import org.junit.Test;

public class CalcTest {
    Calc calc = new Calc();

    @Test(expected = CalcExeption.class)
    public void numberWithMaxSumOfDividersWith0Test() throws CalcExeption {


        System.out.println("\t\t@Test numberWithMaxSumOfDividersWith0Test()");

        calc.numberWithMaxSumOfDividers(0);

    }

    @Test(expected = CalcExeption.class)
    public void numberWithMaxSumOfDividersWithMinus10Test() throws CalcExeption {


        System.out.println("\t\t@Test numberWithMaxSumOfDividersWithMinus10Test()");

        calc.numberWithMaxSumOfDividers(-10);

    }



    @Test
    public  void  numberWithMaxSumOfDividersWith5Test()  throws CalcExeption {

        System.out.println("\t\t@Test numberWithMaxSumOfDividersWith5Test()");

        int actual;
        int expected;
        expected = 4;
        actual = calc.numberWithMaxSumOfDividers(5);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void numberWithMaxSumOfDividersWith10000Test()  throws CalcExeption{

        System.out.println("\t\t@Test numberWithMaxSumOfDividersWith10000Test()");

        int actual;
        int expected;
        expected = 9240;
        actual = calc.numberWithMaxSumOfDividers(10000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  numberWithMaxSumOfDividersWith5000Test()  throws CalcExeption{

        System.out.println("\t\t@Test numberWithMaxSumOfDividersWith5000Test()");

        int actual;
        int expected;
        expected = 4680;
        actual = calc.numberWithMaxSumOfDividers(5000);
        Assert.assertEquals(expected, actual);
    }



}


