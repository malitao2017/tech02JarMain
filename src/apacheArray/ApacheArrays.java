/*
 * ApacheArray.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package apacheArray;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

/**
 * java数组操作和apache常用函数
 * @author LT
 * @version 1.0, 2015年9月14日
 */
public class ApacheArrays {
	public static void main(String[] args) throws Exception{
//		arr();
		beanInvoke();
	}
	/**
	 * apache使用反射机制对bean进行操作
	 * 所需要的包：
	 * commons-beanutils-1.9.1.jar
	 * jcl-over-slf4j-1.7.7.jar
	 * log4j-1.2.17.jar
	 * slf4j-api-1.7.7.jar
	 * slf4j-log4j12-1.7.5.jar
	 */
	public static void beanInvoke() throws Exception{
		//get 对于有多个并且有规律的成员变量的时候就可以遍历编写访问，如96点负荷数据
		Bean bean = new Bean();
		bean.setId(1);
		bean.setName("我是这样的人");
		bean.setDou(9999);
		String value = BeanUtils.getProperty(bean, "dou");
		System.out.println(value);
		
		//set 对其直接赋值
		BeanUtils.setProperty(bean, "dou", 1000);
		System.out.println(bean.getDou());
	}
	/**
	 * 测试数组的相关操作
	 */
	public static void arr(){
		String[] arr = new String[10];
		Arrays.fill(arr,"?"); //把每个单元都填充为“?”号
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");list.add("1234");
		arr = list.toArray(arr); //集合转化为数组
		String apa = StringUtils.join(arr,",") ;//数组转化为加“，”的字符串
		apa = join(arr,",");
		System.out.println(apa);
		System.out.println(StringUtils.isEmpty(apa));
	}
	//实现StringUtils.join 
	public static String join(Object array[], String separator)
    {
        if(array == null)
            return null;
        else
            return join(array, separator, 0, array.length);
    }
	public static String join(Object array[], String separator, int startIndex, int endIndex)
    {
        if(array == null)
            return null;
        if(separator == null)
            separator = "";
        int bufSize = endIndex - startIndex;
        if(bufSize <= 0)
            return "";
        bufSize *= (array[startIndex] != null ? array[startIndex].toString().length() : 16) + separator.length();
        StringBuffer buf = new StringBuffer(bufSize);
        for(int i = startIndex; i < endIndex; i++)
        {
            if(i > startIndex)
                buf.append(separator);
            if(array[i] != null)
                buf.append(array[i]);
        }

        return buf.toString();
    }
}
