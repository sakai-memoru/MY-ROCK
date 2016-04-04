package org.rock.commons;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class NumberCheckUtilTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsNumeric() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "123345";
		boolean expected = true;

		// act
		boolean actual = NumberCheckUtil.isNumeric(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	public void testCheckRange() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		long lng = 123345L;
		boolean expected = true;
		long min = 1L;
		long max = 200000L;

		// act
		boolean actual = NumberCheckUtil.checkRange(lng,min,max);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

}
