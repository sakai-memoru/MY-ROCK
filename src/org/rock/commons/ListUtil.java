package org.rock.commons;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.text.StrBuilder;

public class ListUtil {
	// FIXME Generic
	public static String toString(List<String> lst){
		String[] ary = ArrayUtils.EMPTY_STRING_ARRAY;
		if(lst != null){
			ary = lst.toArray(new String[lst.size()]);
		}
		return Arrays.toString(ary);
	}
	
	// FIXME Object Dump
	public static String toString2(List<? extends Object> lst){
		Object[] ary = ArrayUtils.EMPTY_OBJECT_ARRAY;
		if(lst != null){
			ary = lst.toArray(new Object[lst.size()]);
		}
		StrBuilder sb = new StrBuilder();
		for(Object elm :ary){
			sb.append(elm.toString());
		}
		return StringUtil.putBrackets(sb.toString(), "{", "}");
	}
}
