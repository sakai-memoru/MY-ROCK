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
			retStr = StringUtil.chopTail(temp, 1);
		}
		return StringUtil.putBrackets(retStr, "{", "}");
	}
	/**
	 * convert map to ArrayArray
	 * @param map
	 * @return
	 */
	public static String[][] mapToArrayArray(Map<String,String> map){
		String[][] aryary = new String[map.size()][2];
		int i = 0;
		for(Map.Entry<String, String> entry :map.entrySet()){
			aryary[i][0] = entry.getKey();
			aryary[i][1] = entry.getValue();
			i++;
		}
		return aryary;
	}
	/**
	 * convert map to Table String
	 * @param map
	 * @return
	 */
	public static String mapToStringTable(Map<String,String> map,String separator){
		return ArrayUtil.arrayArrayToStringTable(MapUtil.mapToArrayArray(map), separator);
	}
}
