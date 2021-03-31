import org.junit.*;
import org.junit.Test;


public class CalcTest {

    Calc calc = new Calc();

    @Test(expected = CalcExeption.class)
    public void reverseInputNumberWith0Test() throws CalcExeption {


        System.out.println("\t\t@Test reverseInputNumberWith0Test()");

        calc.reverseInputNumber(0);

    }

    @Test(expected = CalcExeption.class)
    public void reverseInputNumberWithMinus10Test() throws CalcExeption {


        System.out.println("\t\t@Test reverseInputNumberWithMinus10Test()");

        calc.reverseInputNumber(-10);

    }

    @Test
    public void reverseInputNumberWith7216Test() throws CalcExeption {


        System.out.println("\t\t@Test reverseInputNumberWith7216Test()");
        int actual;
        int expected;
        expected = 6127;
        actual = calc.reverseInputNumber(7216);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseInputNumberWith6850Test() throws CalcExeption {

        System.out.println("\t\t@Test reverseInputNumberWith6850Test()");
        int actual;
        int expected;
        expected = 586;
        actual = calc.reverseInputNumber(6850);
        Assert.assertEquals(expected, actual);
    }
}
