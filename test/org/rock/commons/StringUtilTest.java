package org.rock.commons;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class StringUtilTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPadRight() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String expected = str + "       ";
		
		// act
		String actual = StringUtil.padRight(str, 20);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testPadZero1(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "1";
		String expected = "01";
		
		// act
		String actual = StringUtil.padZero(str, 2);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testPadZero2(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "12";
		String expected = "12";
		
		// act
		String actual = StringUtil.padZero(str, 2);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testConcatenate(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String[] strs = new String[] {"sakai",".","mitsuru"};
		String expected = "sakai.mitsuru";
		
		// act
		String actual = StringUtil.concatenate(strs);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPutQuate(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String expected = "\"sakai.mitsuru\"";
		
		// act
		String actual = StringUtil.putQuote(str);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testChopLast(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String expected = "sakai.mits";
		
		// act
		String actual = StringUtil.chopLast(str,3);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
