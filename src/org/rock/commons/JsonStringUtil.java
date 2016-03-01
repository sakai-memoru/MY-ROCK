package org.rock.commons;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson; 

public class JsonStringUtil {
	/** gson */
	public static Gson gson = new Gson();

	/**
	 * convert object to json expression
	 * XXX - not unit test
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj){
		return gson.toJson(obj);
	}
	
	/**
	 * convert key and value to key-value expression 
	 * @param key
	 * @param value
	 * @return
	 */
	public static String toKeyValueExpression(String key,String value){
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtil.putDoubleQuote(key)).append("=").append(StringUtil.putDoubleQuote(value));
		return sb.toString();
	}
	
	/**
	 * convert key and value expression to map
	 * @param sentence
	 * @return
	 */
	public static Map<String,String> keyValueExpressionToMap(String sentence){
		String[] strs = StringUtils.split(sentence,"=");
		if(strs.length == 2){
			for(String str : strs){
				str = str.trim();
				if(StringCheckUtil.isQuoted(str, "\"")){
					str = StringUtil.chopDouble(str);
				}
			}
			Map<String,String> map = new HashMap<>();;
			map.put(strs[0], strs[1]);
			return map;
		}else{
			throw new IllegalArgumentException("Key value sentence is wrong. not in \"=\" or too more.");
		}
	}
	
}
