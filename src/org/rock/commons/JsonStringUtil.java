package org.rock.commons;

import com.google.gson.Gson;

public class JsonStringUtil {
	
	/**
	 * convert key and value to key-value expression 
	 * @param key
	 * @param value
	 * @return
	 */
	public static String toKeyValueExpression(String key,String value){
		StringBuilder sb = new StringBuilder();
		sb.append(StringUtil.putQuote(key)).append("=").append(StringUtil.putQuote(value));
		return sb.toString();
	}
	
	/**
	 * convert object to json expression
	 * XXX - not unit test
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj){
		Gson gson = new Gson();
		return gson.toJson(obj);
	}
}
