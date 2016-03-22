package org.rock.commons;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Strings;

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
	 * FIXME rewrite with validator
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
	
	/**
	 * check string of length
	 * @param str
	 * @param from
	 * @param to
	 * @return
	 */
	public static boolean checkLength(String str,int from, int to){
		int len = str.length();
		if(from > to || from > len || to < len){
			return false;
		}
		return true;
	}
	
	/**
	 * check string of byte length less than length
	 * @param str
	 * @param byteLen
	 * @return
	 */
	public static boolean lessThanByteLength(String str,int byteLen){
		if(Strings.isNullOrEmpty(str)){
			return true;
		}
		byte[]charByte;
		try{
			charByte = str.getBytes("MS932");
		} catch(UnsupportedEncodingException e){
			return false;
		}
		if(charByte.length > byteLen){
			return false;
		}
		return true;
	}
	/**
	 * check string of byte length less than length
	 * @param str
	 * @param byteLen
	 * @return
	 * FIXME 3byte String
	 */
	public static boolean lessThanByteLengthOnUTF8(String str,int byteLen){
		if(Strings.isNullOrEmpty(str)){
			return true;
		}
		byte[]charByte;
		try{
			charByte = str.getBytes("UTF-8");
		} catch(UnsupportedEncodingException e){
			return false;
		}
		if(charByte.length > byteLen){
			return false;
		}
		return true;
	}
	
	
}
