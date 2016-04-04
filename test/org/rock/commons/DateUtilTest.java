package org.rock.commons;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class DateUtilTest {
	
	@Rule
	public TestName testName = new TestName();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetNow(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Date dte = new Date();
		String expected = DateFormatUtils.format(dte,"yyyy/MM/dd HH:mm:ss");

		// act
		String actual = DateUtil.getNow(dte);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testGetNow2(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Date dte = new Date();
		String expected = DateFormatUtils.format(dte,"yyyy/MM/dd HH:mm:ss");

		// act
		String actual = DateUtil.getNow();

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testGzetToday(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Date dte = new Date();
		String expected = DateFormatUtils.format(dte,"yyyy/MM/dd");

		// act
		String actual = DateUtil.getToday();

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}
	@Test
	public void testGetYYYYMMDD(){
		String name = testName.getMethodName();
		System.out.println("-------------------------------------------");
		System.out.println(">> " + name + "   .....");

		// arrange
		Date dte = new Date();
		String expected = DateFormatUtils.format(dte,"yyyyMMdd");

		// act
		String actual = DateUtil.getYYYYMMDD(dte);

		// assert
		System.out.println(actual);
		assertEquals(expected, actual);
        //fail("Not yet implemented");
	}

}
