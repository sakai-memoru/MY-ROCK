package org.rock.commons;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class MapUtilTest {
	
	@Rule
	public TestName testName = new TestName();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMapToJson(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Map<String,String> map = new HashMap<>();
		map.put("mitsuru", "sakai");
		map.put("misa", "sakai");
		map.put("kuniyuki", "sakai");
		String expected = "{\"mitsuru\"=\"sakai\",\"kuniyuki\"=\"sakai\",\"misa\"=\"sakai\"}";

		// act
		String actual = MapUtil.mapToJson(map);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testMapToStringTable(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Map<String,String> map = new HashMap<>();
		map.put("mitsuru", "sakai");
		map.put("misa", "sakai");
		map.put("kuniyuki", "sakai");
		String expected = "mitsuru  | sakai\r\nkuniyuki | sakai\r\nmisa     | sakai\r\n";

		// act
		String actual = MapUtil.mapToStringTable(map,"|");

		// assert
		System.out.println(actual);
		System.out.println("--------------");
		System.out.println(expected);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}

}
