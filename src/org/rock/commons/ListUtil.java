package org.rock.commons;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class ListUtil {

	public static String toString(List<String> lst){
		String[] ary = ArrayUtils.EMPTY_STRING_ARRAY;
		if(lst != null){
			ary = lst.toArray(new String[lst.size()]);
		}
		return Arrays.toString(ary);
	}
}
