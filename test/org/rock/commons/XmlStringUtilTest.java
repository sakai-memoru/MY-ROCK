package org.rock.commons;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class XmlStringUtilTest {
	@Rule
	public TestName testName = new TestName();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPutTag() {
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");
		
		// arrange
		String str = "sakai.mitsuru";
		String tag = "<title>";
		String expected = "<title>sakai.mitsuru</title>";
		
		// act
		String actual = XmlStringUtil.putTag(str,tag);
		
		// assert
		System.out.println(actual);
		assertEquals(expected, actual);

	}

}
