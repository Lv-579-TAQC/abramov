import org.junit.*;
import org.junit.Test;


public class CalcTest {

    Calc calc = new Calc();


    @Test(expected = CalcExeption.class)
    public void is3ExistInNumberWith0Test() throws CalcExeption {


        calc.is3ExistInNumber(0);


    }

    @Test(expected = CalcExeption.class)
    public void is3ExistInNumberWithMinus10Test() throws CalcExeption {

        calc.is3ExistInNumber(-10);


    }


    @Test
    public void is3ExistInNumberWith18Test() throws CalcExeption {

        System.out.println("\t\t@Test is3ExistInNumberWith18Test()");
        String actual;
        String expected;
        expected = "There is 3 in n^2";
        actual = calc.is3ExistInNumber(18);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void is3ExistInNumberWith15Test() throws CalcExeption {

        System.out.println("\t\t@Test is3ExistInNumberWith15Test()");
        String actual;
        String expected;
        expected = "There isn't 3 in n^2";
        actual = calc.is3ExistInNumber(15);
        Assert.assertEquals(expected, actual);
    }

}


