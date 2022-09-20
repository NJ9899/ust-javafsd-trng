package testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import collections.Collections1;

public class TestCase1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2,2);
		assertEquals(5,Collections1.calculate(2,3));
	}
	
	@Test(expected = NullPointerException.class)	
	public void test1() {
		String s = null;
		assertEquals("ABC",s.toUpperCase());
	}
	
	@After
	public void after() {
		System.out.println("in after");
	}
	
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

}






