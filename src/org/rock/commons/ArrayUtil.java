package org.rock.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * @author sakai.memoru
 * XXX generic 対応
 */
public class ArrayUtil {
	
	/**
	 * 一次元配列を二次元配列に変換する
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
	 * 一次元配列keysと一次元配列valuesのセットを二次元配列に変換する
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
	 * to Strings
	 */
	public static String toString(Object obj){
		if(!obj.getClass().isArray()){
			throw new IllegalArgumentException("Not array type.");
		}
		return ArrayUtils.toString(obj);
	}
	
	/**
	 * to Json
	 */
	public static String toJson(Object obj){
		if(!obj.getClass().isArray()){
			throw new IllegalArgumentException("Not array type.");
		}
		return JsonStringUtil.toJson(obj);
	}
	
	
}
