package org.rock.commons;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class StringCheckUtilTest {

	@Rule
	public TestName testName = new TestName();
	

	@Test
	public void testIsNumericIntegerFormatted(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "123,456";
		boolean expected = true;

		// act
		boolean actual = StringCheckUtil.isNumericIntegerFormatted(str);

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
	@Test
	public void testIsQuotedTrue(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "\"sakai.mitsuru\"";
		String quote = "\"";
		boolean expected = true;

		// act
		boolean actual = StringCheckUtil.isQuoted(str,quote);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testIsQuotedFalse(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "\"sakai.mitsuru";
		String quote = "\"";
		boolean expected = false;

		// act
		boolean actual = StringCheckUtil.isQuoted(str,quote);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testIsBraketted(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "[sakai.mitsuru]";
		String preBracket = "[";
		String postBracket = "]";
		boolean expected = true;

		// act
		boolean actual = StringCheckUtil.isBranketted(str,preBracket,postBracket);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
}
