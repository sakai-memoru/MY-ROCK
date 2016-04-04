package org.rock.commons;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import com.google.common.base.Strings;

/**
 * String Utilities  
 * @author sakai.memoru
 * 
 */
public class StringUtil {
	//FIXME String.Joiner
	
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
	public static String concatenate(String[] strs,String delimiter){
		return StringUtils.join(strs,delimiter);
	}
	
	/**
	 * join strings with delimiter
	 * @param delimiter
	 * @param strs
	 * @return
	 */
	public static String join(String delimiter,String... strs){
		return String.join(delimiter, strs);
	}
	
	/**
	 * put string in quote
	 * @param str
	 * @return
	 */
	public static String putDoubleQuote(String str){
		StringBuilder sb = new StringBuilder();
		sb.append("\"").append(str).append("\"");
		return sb.toString();
	}
	/**
	 * put string between brackets
	 * @param str
	 * @return
	 */
	public static String putBrackets(String str,String preBracket,String postBracket){
		StringBuilder sb = new StringBuilder();
		sb.append(preBracket).append(str).append(postBracket);
		return sb.toString();
	}
	
	/**
	 * sub string between quote
	 * @param str
	 * @return
	 */
	public static String substringBetweenDoubleQuote(String str){
		String quote = "\"";
		return StringUtils.substringBetween(str, quote);
	}
	/**
	 * sub string between brackets
	 * @param str
	 * @return
	 */
	public static String substringBetweenBrackets(String str,String preBracket,String postBracket){
		return StringUtils.substringBetween(str, preBracket,postBracket);
	}
	
	/**
	 * chop string with head char size
	 * @param str
	 * @return
	 */
	public static String chopHead(String str,int size){
		return StringUtils.substring(str, size, str.length());
	}
	/**
	 * chop string with last char size
	 * @param str
	 * @return
	 */
	public static String chopTail(String str,int size){
		return StringUtils.substring(str, 0, str.length() - size);
	}
	/**
	 * chop string with head and tail (char size = 1)
	 * @param str
	 * @return
	 */
	public static String chopDouble(String str){
		return StringUtil.chopTail(StringUtil.chopHead(str, 1),1);
	}
	/**
	 * chop string with head and tail char size
	 * @param str
	 * @return
	 */
	public static String chopHeadAndTail(String str,int preSize,int postSize){
		return StringUtil.chopTail(StringUtil.chopHead(str, preSize),postSize);
	}
	/**
	 * chop string with tag
	 * @param str
	 * @return
	 */
	public static String chopTag(String str,String tag){
		return StringUtil.chopTail(StringUtil.chopHead(str, tag.length()),tag.length()+1);
	}
	
	/**
	 * squeeze white space and tab,etc
	 * @param str
	 * @return
	 */
	public static String squeeze(String str){
		return str.replaceAll("\\s+", " ").trim();
	}
	
	/**
	 * replace template sentence with key and value
	 * @param text
	 * @param key
	 * @param value
	 * @return
	 */
	public static String replaceTemplate(String template,String key, String value){
		String replaceString = String.join("", "$", StringUtil.putBrackets(key, "{", "}"));
		//System.out.println(replaceString);
		return StringUtils.replace(template,replaceString,value); 
	}
	/**
	 * replace template sentence with map
	 * @param text
	 * @param key
	 * @param value
	 * @return
	 */
	public static String replaceTemplate(String template,Map<String,String> map){
		String retStr = template;
		if(map != null){
			for (Map.Entry<String, String> entry: map.entrySet()){
				retStr = StringUtil.replaceTemplate(retStr, entry.getKey(), entry.getValue());
			}
		} else {
			retStr = StringUtils.EMPTY;
		}	
		return retStr;
	}
	
	/**
	 * 
	 * @param sb
	 * @param tabStrNumber
	 * @return
	 */
	public static StringBuilder indentStringBuilder(StringBuilder sb,int tabStrNumber){
		StringBuilder retSb = new StringBuilder();
		String tabString = StringUtils.repeat(" ", tabStrNumber);
		String[] lines = StringUtils.split(sb.toString(),SystemUtils.LINE_SEPARATOR);
		
		for(String line : lines){
			retSb.append(tabString).append(line).append(SystemUtils.LINE_SEPARATOR);
		}
		return retSb;
	}
	
	/**
	 * split string by separator and return last element
	 * @param str
	 * @param separator
	 * @return
	 */
	public static String getLastElement(String str,String separator){
		String[] elms = StringUtils.split(str, separator);
		return ArrayUtil.getLastElement(elms);
	}
	
}
