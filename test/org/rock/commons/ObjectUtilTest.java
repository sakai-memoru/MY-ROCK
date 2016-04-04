package org.rock.commons;

import static org.junit.Assert.*;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class ObjectUtilTest {
	
	@Rule
	public TestName testName = new TestName();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDump(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		//String expected = "org.rock.commons.Hoge@2957fcb0[\n  id=1\n  value=hoge\n  strValues={aaa,bbb,ccc}\n  items=[ddd, eee, fff]";

		// act
		String actual = ObjectUtil.dump(hoge);

		// assert
		System.out.println(actual);
		//assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testDumpShortStyle(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String expected = "Hoge[id=1,value=hoge,strValues={aaa,bbb,ccc},items=[ddd, eee, fff]]";

		// act
		String actual = ObjectUtil.dumpShortStyle(hoge);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testDumpPropertiesStyleWithClassName(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String expected = "org.rock.commons.Hoge\n  id=1\n  value=hoge\n  strValues={aaa,bbb,ccc}\n  items=[ddd, eee, fff]";

		// act
		String actual = ObjectUtil.dumpPropertiesStyleWithClassName(hoge);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testDumpProperties(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String expected = "id=1\nvalue=hoge\nstrValues={aaa,bbb,ccc}\nitems=[ddd, eee, fff]";

		// act
		String actual = ObjectUtil.dumpProperties(hoge);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testDumpProperties2(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String[] expected = {
				"id=1"
				,"value=hoge"
				,"strValues={aaa,bbb,ccc}"
				,"items=[ddd, eee, fff]"
			};

		// act
		String actual = ObjectUtil.dumpProperties(hoge);

		// assert
		System.out.println(actual);
		assertEquals(ArrayUtil.join(expected,SystemUtils.LINE_SEPARATOR), actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testToJson(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String expected = "Hoge[id=1,value=hoge,strValues={aaa,bbb,ccc},items=[ddd, eee, fff]]";

		// act
		String actual = ObjectUtil.toJson(hoge);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testToJsonPrettyPrinting(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String expected = "Hoge[id=1,value=hoge,strValues={aaa,bbb,ccc},items=[ddd, eee, fff]]";

		// act
		String actual = ObjectUtil.toJsonPrettyPrinting(hoge);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	@Test
	public void testToString(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Hoge hoge = new Hoge();
		String expected = "Hoge[id=1,value=hoge,strValues={aaa,bbb,ccc},items=[ddd, eee, fff]]";

		// act
		String actual = ObjectUtil.toString(hoge);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}

	@Test
	public void testGetMethodSet(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		String str = "";
		String expected = "";

		// act
		String actual = ObjectUtil.getMethodSet(str);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testGetMethodSetObjectUtil(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		//Object obj = ObjectUtil.class;
		Object obj = new ObjectUtil();
		String expected = "";

		// act
		String actual = ObjectUtil.getMethodSet(obj);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testGetMethodString(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		//Object obj = ObjectUtil.class;
		Object obj = new ObjectUtil();
		String expected = "";

		// act
		String actual = ObjectUtil.getMethodString(obj);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	
	
}
