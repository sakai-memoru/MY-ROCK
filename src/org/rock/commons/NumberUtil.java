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
	 * long to String with comma
	 * @param lng
	 * @return
	 * FIXME
	 */
	public static String formatComma(long lng){
		return NumberFormat.getInstance(Locale.JAPAN).format(lng);
	}
	
	/**
	 * string to long 
	 * @param str
	 * @return
	 * FIXME
	 */
	public static long toLong(String str){
		String strChange = str;
		if(StringCheckUtil.isNumericIntegerFormatted(strChange)){
			strChange.replace(",", "");
		}
		return Long.parseLong(strChange);
	}
	
	/**
	 * big decimal to string
	 * @param str
	 * @return
	 * FIXME
	 */
	public static BigDecimal toBigDecimal(String str){
		if(Strings.isNullOrEmpty(str)){
			return BigDecimal.ZERO;
		}
		return (new BigDecimal(NumberUtil.toLong(str)));
	}

}
