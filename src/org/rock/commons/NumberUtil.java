package org.rock.commons;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import com.google.common.base.Strings;

/**
 * FIXMEÅ@commons.NumberUtilsÇämîF
 * @author sakai.memoru
 *
 */
public class NumberUtil {

	/**
	 * FIXME
	 * 
	 * @param lng
	 * @return
	 */
	public static String formatComma(long lng){
		return NumberFormat.getInstance(Locale.JAPAN).format(lng);
	}
	
	/**
	 * FIXME
	 * @param str
	 * @return
	 */
	public static long toLong(String str){
		String strChange = str;
		if(StringCheckUtil.isNumericIntegerFormatted(strChange)){
			strChange.replace(",", "");
		}
		return Long.parseLong(strChange);
	}
	
	/**
	 * FIXME
	 * @param str
	 * @return
	 */
	public static BigDecimal toBigDecimal(String str){
		if(Strings.isNullOrEmpty(str)){
			return BigDecimal.ZERO;
		}
		return (new BigDecimal(NumberUtil.toLong(str)));
	}

}
