package org.rock.commons;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class WordUtilTest {
	
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
		String expected = "\"" + key + "\"" +"=" + "\"" + value + "\"";

		// act
		String actual = JsonStringUtil.toKeyValueExpression(key, value);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}

	@Test
	public void testToPascaclExpression(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "sakai mitsuru Kubonoya MISA";
		String expected = "SakaiMitsuruKubonoyaMISA";

		// act
		String actual = WordUtil.toPascalCase(str, "_ ");

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testToPascaclExpression2(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "sakai_mitsuru_Kubonoya_MISA";
		String expected = "SakaiMitsuruKubonoyaMISA";

		// act
		String actual = WordUtil.toPascalCase(str, "_ ");

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testToCamelExpression(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "sakai_mitsuru_Kubonoya_MISA";
		String expected = "sakaiMitsuruKubonoyaMISA";

		// act
		String actual = WordUtil.toCamelCase(str, "_ ");

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testCamelCaseToUpperUnderscoreCase(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "sakaiMitsuruKubonoyaMisa";
		String expected = "SAKAI_MITSURU_KUBONOYA_MISA";

		// act
		String actual = WordUtil.camelCaseToUpperUnderscoreCase(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testUpperUnderscoreCaseToCamelCase(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "SAKAI_MITSURU_KUBONOYA_MISA";
		String expected = "sakaiMitsuruKubonoyaMisa";

		// act
		String actual = WordUtil.upperUnderscoreCaseToCamelCase(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testUpperUnderscoreCaseToPascalCase(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "SAKAI_MITSURU_KUBONOYA_MISA";
		String expected = "SakaiMitsuruKubonoyaMisa";

		// act
		String actual = WordUtil.upperUnderscoreCaseToPascalCase(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testToSetterMethodName(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "userNameOfAdmin";
		String expected = "setUserNameOfAdmin";

		// act
		String actual = WordUtil.toSetterMethodName(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testToGetterMethodName(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "userNameOfAdmin";
		String expected = "getUserNameOfAdmin";

		// act
		String actual = WordUtil.toGetterMethodName(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	
}
