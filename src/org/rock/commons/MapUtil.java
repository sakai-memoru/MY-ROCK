package org.rock.commons;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class MapUtil {

	/**
	 * convert map to Json expression
	 * @param map
	 * @return
	 */
	public static String mapToJson(Map<String,String> map){
		StringBuilder sb = new StringBuilder();
		String temp = StringUtils.EMPTY;
		String retStr = StringUtils.EMPTY;
		if(map != null){
			for(Map.Entry<String, String> entry : map.entrySet()){
				sb.append(JsonStringUtil.toKeyValueExpression(entry.getKey(), entry.getValue())).append(",");
			}
			temp = sb.toString();
		}
		if(!StringUtils.isEmpty(temp)){
			retStr = StringUtil.chopLast(temp, 1);
		}
		return StringUtil.putBrackets(retStr, "{", "}");
	}
}
