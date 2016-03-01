package org.rock.commons;

public class XmlStringUtil {

	public static String putTag(String str , String tag){
		String preTag = tag;
		String postTag = "</" + StringUtil.chopHead(tag, 1);
		return StringUtil.putBrackets(str,preTag,postTag);
	}
}
