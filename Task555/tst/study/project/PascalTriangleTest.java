package study.project;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PascalTriangleTest {
	
	PascalTriangle pt = new PascalTriangle();

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
	public void testGetRow() {
		List <Integer> list = new ArrayList<Integer> ();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(1);
		
		List<Integer> actual = pt.getRow(4);
		List<Integer> expected = list;
		Assert.assertEquals(expected, actual);
	}

}
