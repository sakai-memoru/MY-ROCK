package org.rock.commons;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class ArrayUtilTest {
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testArrayToArrayArray() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] expecteds = new String[][]{
				{"mitsuru","sakai"}
			   ,{"misa","sakai"}
			   ,{"tamotsu","sakai"}
			};
		String[] arys = new String[]{"mitsuru","sakai","misa","sakai","tamotsu","sakai"};
		
		// act
		String[][] actuals = ArrayUtil.arrayToArrayArray(arys); 
		
		// assert
		System.out.println(ArrayUtils.toString(actuals));
		assertArrayEquals(expecteds, actuals);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testArraysToArrayArray() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] expecteds = new String[][]{
				{"mitsuru","sakai"}
			   ,{"misa","sakai"}
			   ,{"tamotsu","sakai"}
			};
		String[] keys = new String[]{"mitsuru","misa","tamotsu"};
		String[] values = new String[]{"sakai","sakai","sakai"};
		
		// act
		String[][] actuals = ArrayUtil.arraysToArrayArray(keys,values); 
		
		// assert
		System.out.println(ArrayUtils.toString(actuals));
		assertArrayEquals(expecteds, actuals);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testToList() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		List<String> expecteds = new ArrayList<>();
		expecteds.add("mitsuru");
		expecteds.add("sakai");
		expecteds.add("misa");
		expecteds.add("sakai");
		
		String[] strs = new String[]{"mitsuru","sakai","misa","sakai"};
		
		// act
		List<String> actuals = ArrayUtil.toList(strs); 
		
		// assert
		System.out.println(ListUtil.toString(actuals));
		assertEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testToMap() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","sakai"}
		   ,{"misa","sakai"}
		   ,{"tamotsu","sakai"}
		};
		
		Map<Object,Object> expected = new HashMap<>();
		expected.put("mitsuru", "sakai");
		expected.put("misa", "sakai");
		expected.put("tamotsu", "sakai");
		
		// act
		Map<Object,Object> actual = ArrayUtil.toMap(aryary); 
		
		// assert
		System.out.println(actual.toString());
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testToStringAryAry() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","sakai"}
		   ,{"misa","sakai"}
		   ,{"tamotsu","sakai"}
		};
		
		String expected = "{{mitsuru,sakai},{misa,sakai},{tamotsu,sakai}}";
		
		// act
		String actual = ArrayUtil.toString(aryary); 
		
		// assert
		System.out.println(actual.toString());
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	public void testToStringAry() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary = new String[]{"mitsuru","sakai","misa","sakai"};
		
		String expected = "{mitsuru,sakai,misa,sakai}";
		
		// act
		String actual = ArrayUtil.toString(ary); 
		
		// assert
		System.out.println(actual.toString());
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	public void testToJsonAryAry() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","sakai"}
		   ,{"misa","sakai"}
		   ,{"tamotsu","sakai"}
		};
		
		String expected = "[[\"mitsuru\",\"sakai\"],[\"misa\",\"sakai\"],[\"tamotsu\",\"sakai\"]]";
		
		// act
		String actual = ArrayUtil.toJson(aryary); 
		
		// assert
		System.out.println(actual.toString());
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	public void testToJsonAry() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary = new String[]{"mitsuru","sakai","misa","sakai"};
		
		String expected = "[\"mitsuru\",\"sakai\",\"misa\",\"sakai\"]";
		
		// act
		String actual = ArrayUtil.toJson(ary); 
		
		// assert
		System.out.println(actual.toString());
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	public void testJoin() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary = new String[]{"mitsuru","sakai","misa","sakai"};
		String separator = "|";
		String expected = "mitsuru|sakai|misa|sakai";
		
		// act
		String actual = ArrayUtil.join(ary,separator); 
		
		// assert
		System.out.println(actual.toString());
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	@Test
	public void testGetArrayArrayElementMaxLength() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","sakai"}
		   ,{"misa","sakai"}
		   ,{"tamotsu","sakai"}
		};
		int[] expecteds = new int[]{7,5};
		
		// act
		int[]  actuals = ArrayUtil.getArrayArrayElementMaxLength(aryary); 
		
		// assert
		System.out.println(ArrayUtil.toString(actuals));
		assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testGetMax(){
		int num1 = 5;
		int num2 =10;
		int expected = num2;
		int actual = ArrayUtil.getMax(num1, num2);
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testToStringArrayArrayTable() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","sakai"}
		   ,{"misa","sakai"}
		   ,{"tamotsu","sakai"}
		};
		String separator = "";
		
		// act
		String actual = ArrayUtil.arrayArrayToStringTable(aryary, separator); 
		
		// assert
		System.out.println(actual);
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testToStringArrayArrayTable2() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru.rock","sakai"}
		   ,{"misa","sakai"}
		   ,{"tamotsu","sakai"}
		};
		String separator = "->";
		
		// act
		String actual = ArrayUtil.arrayArrayToStringTable(aryary, separator); 
		
		// assert
		System.out.println(actual);
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testToStringArrayArrayTable3() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		String separator = "|";
		
		// act
		String actual = ArrayUtil.arrayArrayToStringTable(aryary, separator); 
		
		// assert
		System.out.println(actual);
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayToStringLiens(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary = new String[]{"mitsuru","rock","sakai","misa","pop","sakai"};
		String expected = "mitsuru\r\nrock\r\nsakai\r\nmisa\r\npop\r\nsakai";
		
		// act
		String actual = ArrayUtil.arrayToStringLines(ary); 
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
		
	}
	@Test
	public void testArrayArrayToHtmlTable() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		
		// act
		String actual = ArrayUtil.arrayArrayToHtmlTable(aryary); 
		
		// assert
		System.out.println(actual);
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayArrayToHtmlTableWithHeader() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		String[] header = new String[]{
			"firstName","middleName","secondName"};
		
		// act
		String actual = ArrayUtil.arrayArrayToHtmlTableWithHeader(aryary,header); 
		
		// assert
		System.out.println(actual);
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayArrayToWikiTableWithHeader() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		String[] header = new String[]{
			"firstName","middleName","secondName"};
		
		// act
		String actual = ArrayUtil.arrayArrayToWikiTableWithHeader(aryary,header); 
		
		// assert
		System.out.println(actual);
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayArrayToListOfMap() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		String[] header = new String[]{
			"firstName","middleName","secondName"};
		
		// act
		List<Map<Object,Object>> actual = ArrayUtil.arrayArrayToListOfMap(aryary,header); 
		
		// assert
		System.out.println(ListUtil.toString2(actual));
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayArrayToMapOfMap() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		String[] header = new String[]{
			"firstName","middleName","secondName"};
		
		// act
		Map<String,Map<Object,Object>> actual = ArrayUtil.arrayArrayToMapOfMap(aryary,header,0); 
		
		// assert
		System.out.println(MapUtil.toStringMapOfMap(actual));
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayArrayToMapOfMap2() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		String[] header = new String[]{
			"firstName","middleName","secondName"};
		
		// act
		Map<String,Map<Object,Object>> actual = ArrayUtil.arrayArrayToMapOfMap(aryary,header,1,2); 
		
		// assert
		System.out.println(MapUtil.toStringMapOfMap(actual));
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	@Test
	public void testArrayArrayToMapTable() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[][] aryary = new String[][]{
			{"firstName","middleName","secondName"}
		   ,{"mitsuru","rock","sakai"}
		   ,{"misa","pop","sakai"}
		   ,{"tamotsu","jazz","sakai"}
		   ,{"kuniyuki","classics","sakai"}
		};
		
		// act
		Map<String,Map<Object,Object>> actual = ArrayUtil.arrayArrayToMapTable(aryary); 
		
		// assert
		System.out.println(MapUtil.toStringMapOfMap(actual));
		//assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGetLastElement() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary = new String[]{"firstName","middleName","secondName"};
		String expected = "secondName";
		
		// act
		String actual = ArrayUtil.getLastElement(ary); 
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testChopLast() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary = new String[]{"firstName","middleName","secondName"};
		String[] expecteds = new String[]{"firstName","middleName"};
		
		// act
		String[] actuals = ArrayUtil.chopLast(ary); 
		
		// assert
		System.out.println(ArrayUtils.toString(actuals));
		assertArrayEquals(expecteds, actuals);
		//fail("Not yet implemented");
	}

}
