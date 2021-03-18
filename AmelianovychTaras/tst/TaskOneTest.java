//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.*;
//public class TaskOneTest {
//
//    @Test
//    public void test1(){
//        InterfaceOne one = new StubOne();
//        TaskOne t1 =  new TaskOne(one);
//        List<Integer> actual;
//        List<Integer> expected;
//        actual = t1.naturalNumber(150);
//        expected = Arrays.asList(1, 2, 3, 5, 6, 10, 15, 25, 30, 50, 75);
//        Assert.assertEquals(expected,actual);
//    }
//    @Test
//    public void test2(){
//        InterfaceTwo two = new StubTwo();
//        TaskTwo t2 = new TaskTwo(two);
//        List<Integer> actual;
//        List<Integer> expected;
//        actual = t2.simpleNaturalNumber(340);
//        expected = Arrays.asList(2,2,5,17);
//        Assert.assertEquals(expected,actual);
//    }
//    @Test
//    public void test3(){
//        InterfaceThree three = new StubThree();
//        TaskThree t3 = new TaskThree(three);
//        List<Integer> actual;
//        List<Integer> expected;
//        actual = t3.enterSquareNumber(10000);
//        expected = Arrays.asList(1, 5, 6, 25, 76, 376, 625, 9376);
//        Assert.assertEquals(expected,actual);
//    }
//}