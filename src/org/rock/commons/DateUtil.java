package org.rock.commons;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

public class DateUtil {
	
	/**
	 * get now time with yyyy/MM/dd HH:mm:ss
	 * @return
	 */
	public static String getNow(Date dte){
		return DateFormatUtils.format(dte, "yyyy/MM/dd HH:mm:ss");
	}
	/**
	 * get now time with yyyy/MM/dd HH:mm:ss
	 * @return
	 */
	public static String getNow(){
		return DateUtil.getNow(new Date());
	}
	
	/**
	 * get now time with yyyy/MM/dd
	 * @return
	 */
	public static String getToday(Date dte){
		return DateFormatUtils.format(dte, "yyyy/MM/dd");
	}
	/**
	 * get now time with yyyy/MM/dd
	 * @return
	 */
	public static String getToday(){
		return DateUtil.getToday(new Date());
	}
	
	/**
	 * get yyyyMMdd
	 * @param dte
	 * @return
	 */
	public static String getYYYYMMDD(Date dte){
		return DateFormatUtils.format(dte, "yyyyMMdd");
	}

}
