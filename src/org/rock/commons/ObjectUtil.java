package org.rock.commons;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectUtil {
	
	/** Enum */
	enum ClassMember { CONSTRUCTOR, FIELD, METHOD, CLASS, ALL }
	
	/**
	 * dump object to string style
	 * @param obj
	 * @return
	 */
	public static String dump(Object obj){
		return ReflectionToStringBuilder.toString(obj, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	/**
	 * dump object to short string style
	 * @param obj
	 * @return
	 */
	public static String dumpShortStyle(Object obj){
		return ReflectionToStringBuilder.toString(obj, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	/**
	 * dump object to properties style
	 * @param obj
	 * @return
	 */
	public static String dumpPropertiesStyleWithClassName(Object obj){
		String str = ObjectUtil.dump(obj);
		String retStr = formatPropertiesStyle(str,2); 
		return retStr;
	}
	
	/**
	 * dump object to properties style with tab space size
	 * @param obj
	 * @param tabSpace
	 * @return
	 */
	public static String dumpPropertiesStyleWithClassName(Object obj,int tabSpace){
		String str = ObjectUtil.dump(obj);
		String retStr = formatPropertiesStyle(str,tabSpace); 
		return retStr;
	}
	
	/**
	 * dump object for junit comparation
	 * @param obj
	 * @return
	 */
	public static String dumpProperties(Object obj){
		String str = ObjectUtil.dumpPropertiesStyleWithClassName(obj,0);
		String[] lines = StringUtils.split(str,SystemUtils.LINE_SEPARATOR);
		lines = ArrayUtils.remove(lines, 0);
		String retStr = StringUtils.join(lines, SystemUtils.LINE_SEPARATOR);
		return retStr;
	}
	
	/**
	 * dump object to json style
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj){
		return ReflectionToStringBuilder.toString(obj, ToStringStyle.JSON_STYLE);
	}
	
	/**
	 * dump object to json pretty printing style
	 * @param obj
	 * @return
	 */
	public static String toJsonPrettyPrinting(Object obj){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(obj);
	}
	
	/*
	 * format 
	 */
	static String formatPropertiesStyle(String str,int tabSpaces){
		String classname = StringUtils.substringBefore(str,"@");
		String[] props = StringUtils.split(str,SystemUtils.LINE_SEPARATOR);
		StringBuilder sb = new StringBuilder();
		String indentString = StringUtils.repeat(" ", tabSpaces);
		String[] lines = ArrayUtils.remove(props, props.length - 1);
		lines = ArrayUtils.remove(lines, 0);
		sb.append(classname).append(SystemUtils.LINE_SEPARATOR);
		for(String line:lines){
			sb.append(indentString);
			sb.append(StringUtils.trim(line)).append(SystemUtils.LINE_SEPARATOR);
		}
		return sb.toString();
	}
	
	/**
	 * to string tool 
	 * @param obj
	 * @return
	 * FIXME Array‚Å‚ ‚é‚±‚Æ‚ð”»’è‚·‚é
	 */
	public static String toString(Object obj) {
	    StringBuilder sb = new StringBuilder();
	    Field[] fields = obj.getClass().getDeclaredFields();
	    sb.append("Class:" + obj.getClass().getCanonicalName() + SystemUtils.LINE_SEPARATOR);
	    for (Field field : fields) {
	        try {
	            field.setAccessible(true);
	            sb.append(field.getName() + "=" + field.get(obj) + SystemUtils.LINE_SEPARATOR);
	        } catch (IllegalAccessException e) {
	            sb.append(field.getName() + "=" + "access denied" + SystemUtils.LINE_SEPARATOR);
	        }
	    }
	    return sb.toString();
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String getMethodSet(Object obj){
		Method[] methods = obj.getClass().getDeclaredMethods();
		List<String> methodList = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		for(Method method : methods){
			methodList.add(method.getName());
			//System.out.println(method.getName());
		}
		set.addAll(methodList);
		String[] ary = new String[set.size()];
		set.toArray(ary);
		Arrays.sort(ary);
		return ArrayUtil.join(ary,SystemUtils.LINE_SEPARATOR);
	}
		
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String getMethodString(Object obj){
		Method[] methods = obj.getClass().getDeclaredMethods();
		List<String> methodList = new ArrayList<String>();
		String classname = obj.getClass().getSimpleName();
		System.out.println("Class Name = " + classname);
		String methodName;
		String returnType;
		int iModifier;
		
		for(Method method : methods){
			
		}
		return methodList.toString();
	}
	
	
    public static List<String[]> getParameterNames(Method method) {
        Parameter[] parameters = method.getParameters();
        List<String[]> parameterInfos = new ArrayList<>();
        String parameterName;
        String parameterType;

        for (Parameter parameter : parameters) {
            if(!parameter.isNamePresent()) {
                throw new IllegalArgumentException("Parameter names are not present!");
            }
            parameterName = parameter.getName();
            parameterType = parameter.getType().getSimpleName();
            String[] pair = new String[]{parameterName,parameterType};
            parameterInfos.add(pair);
        }
        return parameterInfos;
    }
	

	
} //------------------------------------ end of class
