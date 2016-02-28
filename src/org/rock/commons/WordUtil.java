package org.rock.commons;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.CaseFormat;

public class WordUtil {
	
	/**
	 * convert to pascal case
	 * @param str
	 * @param separatorChars
	 * @return
	 */
	public static String toPascalCase(String str,String separatorChars){
		StringBuilder sb = new StringBuilder();
		String[] ary = StringUtils.split(str, separatorChars);
		for(String elm : ary){
			sb.append(StringUtils.capitalize(elm));
		}
		return sb.toString();
	}
	
	/**
	 * convert to camel case
	 * @param str
	 * @param separatorChars
	 * @return
	 */
	public static String toCamelCase(String str,String separatorChars){
		StringBuilder sb = new StringBuilder();
		String[] ary = StringUtils.split(str, separatorChars);
		int i = 0;
		for(String elm : ary){
			if(i == 0){
				sb.append(StringUtils.uncapitalize(elm));
			}else{
				sb.append(StringUtils.capitalize(elm));
			}
			i++;
		}
		return sb.toString();
	}
	
	/**
	 * convert camel case to upper underscore case
	 * @param str
	 * @return
	 */
	public static String camelCaseToUpperUnderscoreCase(String str){
		return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, str);
	}
	
	/**
	 * convert upper underscore case to camel case
	 * @param str
	 * @return
	 */
	public static String upperUnderscoreCaseToCamelCase(String str){
		return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
	}
	
	/**
	 * convert upper underscore case to pascal case
	 * @param str
	 * @return
	 */
	public static String upperUnderscoreCaseToPascalCase(String str){
		return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, str);
	}
	/**
	 * convert property name to setter method name
	 * @param propertyName
	 * @return
	 */
	public static String toSetterMethodName(String propertyName){
		return "set" + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, propertyName);
	}
	/**
	 * convert property name to getter method name
	 * @param propertyName
	 * @return
	 */
	public static String toGetterMethodName(String propertyName){
		return "get" + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, propertyName);
	}
	
}
