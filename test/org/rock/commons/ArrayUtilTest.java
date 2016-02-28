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

}
