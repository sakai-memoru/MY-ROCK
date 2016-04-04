package org.rock.commons;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.StrBuilder;

import com.google.common.base.Joiner;
import com.google.common.base.Joiner.MapJoiner;

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
	/**
	 * 
	 * @param mapOfMap
	 * @return
	 */
	public static String toStringMapOfMap(Map<String,Map<Object,Object>> mapOfMap){
		
		StrBuilder sb = new StrBuilder();
		
		for(Map.Entry<String, Map<Object,Object>> entry :mapOfMap.entrySet()){
			sb.append("{").append(entry.getKey()).append("=").append(entry.getValue().toString()).append("}");
		}
		return StringUtil.putBrackets(sb.toString(), "{", "}");
	}
	
	/**
	 * join 
	 * wrap goava map joiner
	 * @param map
	 * @param separator
	 * @param keyValueSeparator
	 * @param nullText
	 * @return
	 */
	public static String join(Map<String,String> map,String separator,String keyValueSeparator,String nullText){
		MapJoiner mapJoiner = Joiner.on(separator).withKeyValueSeparator(keyValueSeparator).useForNull(nullText);
		return mapJoiner.join(map);
	}
	
}
