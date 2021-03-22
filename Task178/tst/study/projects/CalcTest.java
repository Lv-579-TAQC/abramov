package study.projects;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	
	Calc calc = new Calc();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1Calc1() {
		List <Double> list = new ArrayList<Double> ();
		list.add(1.0);
		list.add(2.0);
		list.add(4.0);
		
		List<Double> actual = calc.calc1(list);
		List<Double> expected = new ArrayList<Double>();
		expected.add(2.0);
		Assert.assertEquals(expected, actual);
		
		
	}

	@Test
	public void test1Calc2() {
		List <Double> list = new ArrayList<Double> ();
		list.add(1.0);
		list.add(2.0);
		list.add(4.0);
		list.add(17.0);
		list.add(31.0);
		
		
		List<Double> actual = calc.calc2(list);
		List<Double> expected = new ArrayList<Double>();
		expected.add(17.0);
		Assert.assertEquals(expected, actual);
	}
}