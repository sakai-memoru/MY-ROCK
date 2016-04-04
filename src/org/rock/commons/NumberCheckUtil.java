package org.rock.commons;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class NumberCheckUtil {
	
	/**
	 * check number digit from - to
	 * @param lng
	 * @param from
	 * @param to
	 * @return
	 */
	public static boolean checkNumberOfDigit(long lng , int from, int to){
		if(lng == 0){
			return false;
		}
		return StringCheckUtil.checkLength(String.valueOf(lng), from, to);
	}
	
	/**
	 * StringUtils.isNumeric wrap
	 * �����񂪐����ł��邱�Ƃ̃`�F�b�N
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){
		return StringUtils.isNumeric(str);
	}
	
	/**
	 * NumberUtils.isNumber wrap
	 * Java�ň����鐔�l��\���l�̕�����ł��邱�Ƃ��`�F�b�N
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str){
		return NumberUtils.isNumber(str);
	}
	
	/**
	 * NumberUtils.isDigits wrap
	 * �����ł��邱�Ƃ̃`�F�b�N
	 * @param str
	 * @return
	 */
	public static boolean isDigits(String str){
		return NumberUtils.isDigits(str);
	}
	
	/**
	 * check number between min and max
	 * @param lng
	 * @param minLng
	 * @param maxLng
	 * @return
	 */
	public static boolean checkRange(Long lng,Long minLng,Long maxLng){
		if(minLng <= lng){
			if(lng <= maxLng){
				return true;
			} 
		}
		return false;
	}
	
}
