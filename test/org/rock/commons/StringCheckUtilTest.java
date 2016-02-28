package org.rock.commons;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class StringCheckUtilTest {

	@Rule
	public TestName testName = new TestName();
	

	@Test
	public void testIsNumericFormatted(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "123,456";
		boolean expected = true;

		// act
		boolean actual = StringCheckUtil.isNumericFormatted(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testIsMailAddress(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "sakai.mitsuru@gmail.com";
		boolean expected = true;

		// act
		boolean actual = StringCheckUtil.isMailAddress(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testIsMailAddress2(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "sakai.mitsuru+memo@gmail.com";
		boolean expected = true;

		// act
		boolean actual = StringCheckUtil.isMailAddress(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
}
