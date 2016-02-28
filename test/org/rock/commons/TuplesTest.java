package org.rock.commons;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TuplesTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPut(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String key = "mitsuru";
		String value ="sakai";
		Tuples tupl = new Tuples();
		tupl.put(key,value);
		Map<String,String> expected = new HashMap<>();
		expected.put(key, value);
		
		// act
		Map<String,String> actual = tupl.toMap();

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testGetValue(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String key = "mitsuru";
		String value = "sakai";
		Tuples tupl = new Tuples();
		tupl.put(key,value);
		
		Object expected = value;
		
		// act
		Object actual = tupl.getValue(key);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testPutStringArray(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] ary1 = {"mitsuru","sakai"};
		String[] ary2 = {"misa","sakai"};
		
		Tuples tupl = new Tuples();
		tupl.put(ary1);
		tupl.put(ary2);
		
		Map<Object,Object> expected = new HashMap<>();
		expected = ArrayUtils.toMap(new String[][]{ary1,ary2});
		
		// act
		Map<String,String> actual = tupl.toMap();

		// assert
		System.out.println(tupl.toString());
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}	
}
