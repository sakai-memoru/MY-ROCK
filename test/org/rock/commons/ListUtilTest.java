package org.rock.commons;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class ListUtilTest {
	@Rule
	public TestName testName = new TestName();
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToString() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String[] arys = new String[]{"mitsuru","sakai","misa","sakai","tamotsu","sakai"};
		List<String> lst = Arrays.asList(arys); 
		
		String expected = "[mitsuru, sakai, misa, sakai, tamotsu, sakai]";
		
		// act
		String actual = ListUtil.toString(lst); 
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

}
