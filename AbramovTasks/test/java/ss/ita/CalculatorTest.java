import main.java.ss.ita.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class CalculatorTest {
        Calculator calculator = new Calculator();

        @Test
        public void testGetLastNumbers1() {  // all is OK
            List<Integer> actual = calculator.getLastNumbers(123456, 3);
            List<Integer> expected = new ArrayList<>(Arrays.asList(6, 5, 4));
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void testGetLastNumbers2() {  // wrong answer
            List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
            List<Integer> actual = calculator.getLastNumbers(123456, 3);
            Assert.assertNotEquals(expected, actual);
        }
        @Test
        public void testGetLastNumbers3() { //  not natural number (<0)
            List<Integer> expected = new ArrayList<>();
            List<Integer> actual = calculator.getLastNumbers(-1, 1);
            Assert.assertNotEquals(expected, actual);
        }
        @Test
        public void testGetLastNumbers4() {  //  size of last numbers <1
            List<Integer> expected = new ArrayList<>();
            List<Integer> actual = calculator.getLastNumbers(1506, 0);
            Assert.assertNotEquals(expected, actual);
        }
        @Test
        public void testGetLastNumbers5() {  //  size of last numbers > count of numbers in main number
            List<Integer> expected = new ArrayList<>();
            List<Integer> actual = calculator.getLastNumbers(123456, 10);
            Assert.assertNotEquals(expected, actual);
        }
        @Test
        public void testSumLastNumbers1() {  // all is OK
            int expected = 13;
            List<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(1,2,3,4,3));
            int actual = calculator.sumOfLastNumbers(numbers);
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void testSumLastNumbers2() {  // wrong answer
            int expected = 19;
            List<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(1,3,3,7,2));
            int actual = calculator.sumOfLastNumbers(numbers);
            Assert.assertNotEquals(expected, actual);
        }
        @Test
        public void testSumLastNumbers3() {  // boundary value (empty list) all is OK
            int expected = 0;
            List<Integer> actual = calculator.getLastNumbers(0,0);
            Assert.assertNotEquals(expected, actual);
        }
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
