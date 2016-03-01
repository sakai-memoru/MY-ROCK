package org.rock.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringCheckUtil {
	
	/**
	 * validate numeric formatted
	 * @param str
	 * @return
	 */
	public static boolean isNumericIntegerFormatted(String str){
		String regex = StringConst.regexNumberFormatted; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		return m.find();
	}
	
	/**
	 * validate mail address
	 * @param str
	 * @return
	 */
	public static boolean isMailAddress(String str){
		String regex = StringConst.regexMailAddress; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		return m.find();
	}
	
	/**
	 * validate between quotes
	 * @param str
	 * @param quote
	 * @return
	 */
	public static boolean isQuoted(String str,String quote){
		boolean retBln = false;
		if(StringUtils.startsWith(str, quote)){
			if(StringUtils.endsWith(str, quote)){
				retBln = true;
			}
		}
		return retBln;
	}
	
	/**
	 * validate between brackets
	 * @param str
	 * @param quote
	 * @return
	 */
	public static boolean isBranketted(String str,String preBracket,String postBracket){
		boolean retBln = false;
		if(StringUtils.startsWith(str, preBracket)){
			if(StringUtils.endsWith(str, postBracket)){
				retBln = true;
			}
		}
		return retBln;
	}
	
	
}
