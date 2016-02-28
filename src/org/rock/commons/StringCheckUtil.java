package org.rock.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheckUtil {
	
	public static boolean isNumericFormatted(String str){
		String regex = StringConst.regexNumberFormatted; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		return m.find();
	}
	
	public static boolean isMailAddress(String str){
		String regex = StringConst.regexMailAddress; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		return m.find();
	}
	
	
	
}
