package org.rock.commons;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Strings;

public class StringUtil {
	
	/**
	 * pad right spaces
	 * @param str
	 * @param size
	 * @return transformed string
	 */
	public static String padRight(String str, int size){
		return StringUtils.rightPad(str, size);
	}
	/**
	 * pad left zero
	 * @param str
	 * @param size
	 * @return
	 */
	public static String padZero(String str,int size){
		return Strings.padStart(str, size, '0');
	}
	/**
	 * is Null or Empty 
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str){
		return Strings.isNullOrEmpty(str);
	}
	
	/**
	 * concatenate array of strings
	 * @param strs
	 * @return
	 */
	public static String concatenate(String[] strs){
		return StringUtils.join(strs,",");
	}
}
