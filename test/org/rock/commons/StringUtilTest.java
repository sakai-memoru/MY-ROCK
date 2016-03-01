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
		String actual = StringUtil.concatenate(strs,"");
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testJoin(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str1 = "sakai";
		String str2 = "mitsuru";
		String str3 = "rock and roll";
		String expected = "sakai.mitsuru.rock and roll";
		
		// act
		String actual = StringUtil.join(".",str1,str2,str3);
		
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
		String actual = StringUtil.putDoubleQuote(str);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testPutBrackets(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String preBracket = "[";
		String postBracket = "]";
		String expected = "[sakai.mitsuru]";
		
		// act
		String actual = StringUtil.putBrackets(str,preBracket,postBracket);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubstringBetweenQuote(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.\"mits\"uru";
		String expected = "mits";
		
		// act
		String actual = StringUtil.substringBetweenDoubleQuote(str);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSubstringBetweenBrackets(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "{sakai} mitsuru";
		String expected = "sakai";
		
		// act
		String actual = StringUtil.substringBetweenBrackets(str,"{","}");
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testChopHead(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String expected = "ai.mitsuru";
		
		// act
		String actual = StringUtil.chopHead(str,3);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testChopTail(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String expected = "sakai.mits";
		
		// act
		String actual = StringUtil.chopTail(str,3);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testChopDouble(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "[sakai.mitsuru]";
		String expected = "sakai.mitsuru";
		
		// act
		String actual = StringUtil.chopDouble(str);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testChopHeadAndTail(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "<h1>sakai.mitsuru</h1>";
		String expected = "sakai.mitsuru";
		String tag = "<h1>";
		
		// act
		String actual = StringUtil.chopHeadAndTail(str,tag.length(),tag.length()+1);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testChopTag(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "<title>sakai.mitsuru</title>";
		String expected = "sakai.mitsuru";
		String tag = "<title>";
		
		// act
		String actual = StringUtil.chopTag(str,tag);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSqueese(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = " sakai   mitsuru  ";
		String expected = "sakai mitsuru";
		
		// act
		String actual = StringUtil.squeeze(str);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);	
	}
	@Test
	public void testReplace(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String text = "sakai ${middleName} mitsuru";
		String expected = "sakai rock mitsuru";
		String key = "middleName";
		String value = "rock";
		
		// act
		String actual = StringUtil.replace(text,key,value);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);	
	}
	
	
	
}
