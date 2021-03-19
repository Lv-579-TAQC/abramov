import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArmstrongTest {

    private static Armstrong armstrong;

    public ArmstrongTest() {
        armstrong = new Armstrong();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before setUp()");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("@After tearDown() ");
    }

    @Test
    public void getNumbersTest() {
        System.out.println("@Test getNumbers(int n)");
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(153);
        expectedList.add(370);
        expectedList.add(371);
        expectedList.add(407);
        expectedList.add(1634);
        expectedList.add(8208);
        expectedList.add(9474);
        List<Integer> actualList = armstrong.getNumbers(9999);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void getNumbersTestLessThenTen() {
        System.out.println("@Test getNumbers(int n) on less then ten");
        List<Integer> expectedList = new ArrayList<>();
        List<Integer> actualList = armstrong.getNumbers(10);

        Assert.assertEquals(expectedList, actualList);
    }
}
