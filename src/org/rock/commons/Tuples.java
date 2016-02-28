package org.rock.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Tuple Class
 * treat key-value(mainly String) Class
 * @author sakai.mitsuru
 * @since 2016/02/27
 * @version 1.00
 * 
 * XXX not unit test
 */
public class Tuples {
	/** key-value map */
	Map<String,String> map = new HashMap<>();
	/** list of key-value pair */
	List<Pair<String,String>> lst = new ArrayList<>();

	public void put(String key,String value){
		if(map.containsKey(key)){
			throw new IllegalArgumentException("Tuples already contains a key ["+ key +"].");
		} else {
			map.put(key, value);
			lst.add(new ImmutablePair<String, String>(key,value));
		}
	}
	
	public Object getValue(String key){
		return map.get(key);
	}
	
	public Map<String,String> toMap(){
		return this.map;
	}
	
	public String[] getKeyArray(){
		String[] keys = ArrayUtils.EMPTY_STRING_ARRAY;
		for(Pair<String,String> pr : lst){
			ArrayUtils.add(keys, pr.getKey());
		}
		return keys;
	}
	public Object[] getValueArray(){
		Object[] values = ArrayUtils.EMPTY_OBJECT_ARRAY;
		for(Pair<String,String> pr : lst){
			ArrayUtils.add(values, pr.getValue());
		}
		return values;
	}
	
	public void put(String[] strs){
		if(strs.length == 2){
			this.put(strs[0],strs[1]);
		} else {
			throw new IllegalArgumentException("Tuple pair is not equal 2 elements ["+ ArrayUtils.toString(strs) +"].");
		}
	}
	
	public void putAll(Map<String,String> mapSrc){
		if(map != null){
			for(Map.Entry<String,String> entry :mapSrc.entrySet()){
				this.put(entry.getKey(),entry.getValue());
			}
		}
	}
	
	public void putAll(String[][] strs){
		if(strs != null){
			for(String[] pair :strs){
				this.put(pair);
			}
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String,String> entry : this.map.entrySet()){
			sb.append(entry.getKey()).append("=").append(entry.getValue());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String toJson(){
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String,String> entry : this.map.entrySet()){
			sb.append(entry.getKey()).append("=").append(entry.getValue());
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
