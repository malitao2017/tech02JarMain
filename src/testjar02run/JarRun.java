package testjar02run;

import java.util.Arrays;

import org.apache.commons.lang.StringUtils;

public class JarRun {
	/**
	 * 目标：程序引用了别的包，要打成jar包，成功运行
	 * 使用了 commons-lang-2.4.jar
	 * 生成方式：eclipse中在JarRun类右击export,选择jar file
	 * 测试路径：D:\temp\jarrun\jarr.jar
	 * 运行命令：java -jar jarr.jar
	 * 命令补充： -Xms256m -Xmx1024m -D"log.path=%INS_HOME%\logs" -D"log4j.configuration=file:%INS_HOME%\cfg\collect\log4j.properties"
	 * 注意1：要把用到的 commons-lang-2.4.jar 放到jarr.jar同目录下
	 * 
	 * 注意2：打成的jarr.jar目录中的META-INF\MANIFEST.MF 中的信息应该为（注意最后有回车），
	 * 没有Class-Path的话，手动添加：
	
	*	    Manifest-Version: 1.0
	*		Class-Path: commons-lang-2.4.jar
	*		Main-Class: testjar02run.JarRun
	*
	
	 * 
	 * 参考：
	 * http://www.cnblogs.com/mq0036/p/3885407.html
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("测试 jar 命令运行方式：引用了其他的包需要一块打进去jar包");
		String[] strs = new String[10];
		Arrays.fill(strs, "!");
		System.out.println(StringUtils.join(strs));
	}
	
}
