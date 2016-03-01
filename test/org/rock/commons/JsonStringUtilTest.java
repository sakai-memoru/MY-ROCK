package org.rock.commons;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class JsonStringUtilTest {
	
	@Rule
	public TestName testName = new TestName();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToKeyValueExpression(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String key = "mitsuru";
		String value = "sakai";
		String expected = "\"mitsuru\"=\"sakai\"";

		// act
		String actual = JsonStringUtil.toKeyValueExpression(key, value);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	/**
	 * XXX Examine blow url
	 * http://stackoverflow.com/questions/18627494/how-do-i-assert-that-two-hashmap-with-javabean-values-are-equal
	 */
	public void testKeyValueExpressionToMap(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "\"mitsuru\"=\"sakai\"";
		String key = "mitsru";
		String value = "sakai";
		Map<String,String> expected = new HashMap<>();
		expected.put(key, value);

		// act
		Map<String,String> actual = JsonStringUtil.keyValueExpressionToMap(str);

		// assert
		System.out.println(actual);
		assertTrue(expected.equals(actual));
        //fail("Not yet implemented");
	}

}
