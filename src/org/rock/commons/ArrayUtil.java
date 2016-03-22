package org.rock.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.text.StrBuilder;


/**
 * 
 * @author sakai.memoru
 * XXX generic 対応
 */
public class ArrayUtil {
	
	/**
	 * 一次元配列を二次元配列に変換する(String型)
	 * @param arys 
	 * @return
	 */
	public static String[][] arrayToArrayArray(String[] arys){
		List<String[]> lst = new ArrayList<String[]>();
		
		int len = arys.length;
		if(len%2 == 0){
			for(int i=0; i < len ;){
				String[] pairAry = new String[2];
				pairAry[0] = arys[i];
				pairAry[1] = arys[i+1]; 
				lst.add(pairAry);
				i += 2;
			}
		} else {
			throw new IllegalArgumentException("Array length is odd.Length =[" + len + "]");
		}
		return (String[][])lst.toArray(new String[0][0]);
	}
	
	/**
	 * 一次元配列keysと一次元配列valuesのセットを二次元配列に変換する(String型)
	 * @param keys
	 * @param values
	 * @return
	 */
	public static String[][] arraysToArrayArray(String[] keys,String[] values){
		List<String[]> lst = new ArrayList<String[]>();
		
		if(ArrayUtils.isSameLength(keys, values)){
			for(int i=0; i < keys.length ;i++){
				String[] pairAry = new String[2];
				pairAry[0] = keys[i];
				pairAry[1] = values[i]; 
				lst.add(pairAry);
			}
		} else {
			throw new IllegalArgumentException("Arrays length are not same.");
		}
		return (String[][])lst.toArray(new String[0][0]);
	}
	
	/**
	 * convert array to list
	 * @param strs
	 * @return
	 */
	public static List<String> toList(String[] strs){
		return Arrays.asList(strs);
	}
	
	/**
	 * convert aryary to map 
	 * @param aryary
	 * @return
	 */
	public static Map<Object,Object> toMap(String[][] aryary){
		return ArrayUtils.toMap(aryary);
	}
	
	/**
	 * to string
	 */
	public static String toString(Object obj){
		if(!obj.getClass().isArray()){
			throw new IllegalArgumentException("Not array type.");
		}
		return ArrayUtils.toString(obj);
	}

	/**
	 * convert to Table
	 */
	public static String arrayArrayToStringTable(String[][] aryary,String separator){
		String[][] tempAryAry = Arrays.copyOf(aryary, aryary.length);
		int[] lens = getArrayArrayElementMaxLength(aryary);
		for(int i=0;i < aryary.length ;i++){
			for(int j=0;j < aryary[i].length ;j++){
				tempAryAry[i][j] = StringUtil.padRight(aryary[i][j], lens[j]);
			}
		}
		StrBuilder sb = new StrBuilder();
		if(StringUtil.isNullOrEmpty(separator)){
			separator = " ";
		} else {
			separator = " " + separator + " ";
		}
		for(String[] strs :tempAryAry){
			sb.appendln(String.join(separator, strs));
		}
		return sb.toString();
	}
	
	static int getMax(int num1,int num2){
		return (num1 > num2 ? num1 : num2);
	}
	
	static int[] getArrayArrayElementMaxLength(String[][] aryary){
		int[] lens = new int[aryary[0].length];
		for(String[] ary:aryary){
			for(int i=0;i < ary.length ;i++){
				lens[i] = getMax(lens[i],ary[i].length());
			}
		}
		return lens;
	}
	/**
	 * convert to html table 
	 * @param strs
	 * @return
	 */
	public static String join(String[] strs,String separator){
		return String.join(separator, strs);
	}

	/**
	 * convert to Json
	 */
	public static String toJson(Object obj){
		if(!obj.getClass().isArray()){
			throw new IllegalArgumentException("Not array type.");
		}
		return JsonStringUtil.toJson(obj);
	}
	/**
	 * convert to html table 
	 * @param aryary
	 * @return
	 * XXX deal with header
	 * XXX set indent tab 
	 */
	public static String arrayArrayToHtmlTable(String[][] aryary){
		StrBuilder sb = new StrBuilder();
		String[] tablerows = new String[aryary.length];
		int i = 0;
		for(String[] tr : aryary){
			for(String td : tr){
				sb.append(XmlStringUtil.putTag(td, HtmlConst.TD));
			}
			tablerows[i] = StringUtil.replaceTemplate(HtmlConst.TR,"tr",sb.toString());
			sb.clear();
			i++;
		}
		return StringUtil.replaceTemplate(HtmlConst.TABLE, "table", ArrayUtil.arrayToStringLines(tablerows));
	}
	
	/**
	 * array to string lines
	 * @param lines
	 * @return
	 * XXX stream化
	 */
	public static String arrayToStringLines(String[] lines){
		return String.join("\r\n",lines);
	}
	
	/**
	 * convert to html table with Header 
	 * @param aryary
	 * @return
	 * XXX deal with header
	 * XXX set indent tab 
	 */
	public static String arrayArrayToHtmlTableWithHeader(String[][] aryary,String[] header){
		
		if(aryary[0].length != header.length){
			throw new IllegalArgumentException("header array length is not same with array body.");
		}
		
		StrBuilder sb = new StrBuilder();
		String[] tablerows = new String[aryary.length + 1];
		
		// th 
		for(String th : header){
			sb.append(XmlStringUtil.putTag(th, HtmlConst.TH));
		}
		tablerows[0] = StringUtil.replaceTemplate(HtmlConst.TR,"tr",sb.toString());
		sb.clear();
		
		// td 
		int i = 1;
		for(String[] tr : aryary){
			for(String td : tr){
				sb.append(XmlStringUtil.putTag(td, HtmlConst.TD));
			}
			tablerows[i] = StringUtil.replaceTemplate(HtmlConst.TR,"tr",sb.toString());
			sb.clear();
			i++;
		}
		return StringUtil.replaceTemplate(HtmlConst.TABLE, "table", ArrayUtil.arrayToStringLines(tablerows));
	}
	/**
	 * convert to wiki table with Header 
	 * @param aryary
	 * @return
	 * XXX deal with header
	 * XXX set indent tab 
	 */
	public static String arrayArrayToWikiTableWithHeader(String[][] aryary,String[] header){
		if(aryary[0].length != header.length){
			throw new IllegalArgumentException("header array length is not same with array body.");
		}
		String[] tablerows = new String[aryary.length + 1];
		// th
		String head = ArrayUtil.join(header, "|*");
		tablerows[0] = StringUtil.putBrackets(head, "|*", "|");
		// td 
		int i = 1;
		String row = "";
		for(String[] tr : aryary){
			row = ArrayUtil.join(tr, "|*");
			tablerows[i] = StringUtil.putBrackets(row, "|*", "|");
			i++;
		}
		return ArrayUtil.arrayToStringLines(tablerows);
	}
	/**
	 * convert to List of map with Header 
	 * @param aryary
	 * @param header
	 * @return
	 */
	public static List<Map<Object,Object>> arrayArrayToListOfMap(String[][] aryary,String[] header){
		if(aryary[0].length != header.length){
			throw new IllegalArgumentException("header array length is not same with array body.");
		}
		List<Map<Object,Object>> list = new ArrayList<>();
		// rows 
		for(String[] row : aryary){
			Map<Object,Object> map = new HashMap<>();
			String[][] dimMap = ArrayUtil.arraysToArrayArray(header, row);
			map = ArrayUtil.toMap(dimMap);
			list.add(map);
		}
		return list;
	}
	/**
	 * convert to Map of map with Header 
	 * @param aryary
	 * @return
	 * XXX deal with header
	 * XXX set indent tab 
	 */
	public static Map<String,Map<Object,Object>> arrayArrayToMapOfMap(String[][] aryary,String[] header,int... keyLocations ){
		if(aryary[0].length != header.length){
			throw new IllegalArgumentException("header array length is not same with array body.");
		}
		Map<String,Map<Object,Object>> retMap = new HashMap<>();
		StrBuilder sb = new StrBuilder();
		String key ="";
		// rows 
		for(String[] row : aryary){
			// key
			for(int loc : keyLocations){
				sb.append(row[loc]).append(".");
			}
			key = StringUtil.chopTail(sb.toString(),1);
			sb.clear();
			// value map
			Map<Object,Object> map = new HashMap<>();
			String[][] dimMap = ArrayUtil.arraysToArrayArray(header, row);
			map = ArrayUtil.toMap(dimMap);
			// FIXME if exists key
			retMap.put(key,map);
		}
		return retMap;
	}
	
	public static Map<String,Map<Object,Object>> arrayArrayToMapTable(String[][] aryary){
		String[] header = aryary[0];
		String[][] aryaryBody = ArrayUtils.remove(aryary, 0);
		return ArrayUtil.arrayArrayToMapOfMap(aryaryBody, header, 0);
	}
	
}
