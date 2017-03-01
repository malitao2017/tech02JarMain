/*
 * main.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package tect02JarMain;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

/**
 * 测试运行命令接收的参数，以及运行jar包
 * @author LT
 * @version 1.0, 2015年9月10日
 */
public class mainT {
	public static void main(String[] args) throws ParseException {
		//做jar的区别
		//testJar();
		
		//处理命令行，不用遍历 args 
		//-c 代码 -t time   ，在eclipse的runConfigurations中设置
		command(args);
	}
	/**
	 *  CLI 即Command Line Interface，也就是"命令行接口"，它为Java 程序访问和解析命令行 
		参数提供了一种统一的接口。 
		主要处理java启动时,输入命令行的 
		纯java编译完*.class以后,会通过,下面命令运行带main的类 
		java 类名 
		打成jar包的则通过下面命令(带main方法) 
		java –jar 包名.jar 
		在eclipse下运行则需要通过Run as /runConfigurations/Arguments来进行命令行参数配置 
		参数的配置和我们常用的命令一样,横杠+参数名+空格+参数值 
		-参数名 参数值 
		然后java会根据main方法中 String[] args来取得命令行参数 
		通过使用commons-cli则可以很容易的访问参数，而不必去循环String[] args
	 * @throws ParseException 
	 */
	public static void command(String[] args) throws ParseException{
		//-c code -t time
		Options options = new Options();
		options.addOption("c",true, "值为code此参数可用，此为说明");//参数可用
		options.addOption("t",false,"值为time此参数不可用，此为说明");//参数不可用
		
		CommandLineParser parser = new PosixParser();
		CommandLine cmd = parser.parse(options, args);
		
		if(cmd.hasOption("c")){
			String countryCode = cmd.getOptionValue("c");
			System.out.println("参数c的值为:"+countryCode);
		}
		if(cmd.hasOption("t")){
			String countryCode = cmd.getOptionValue("t");
			System.out.println("参数t的值为:"+countryCode);
		}
		
		//自动生成帮助声明
		HelpFormatter formtter = new HelpFormatter();
		formtter.printHelp("对options中的命令查看用法", options);
	}
	/**
	 * 两个jar的 testjar.jar 和 testjar1.jar
	 * 1.操作的时候用eclipse的话，是工具选择的时候有main函数选项
	 * 2.META-INF 中一个有 Main-Class
	 * 3.一个可以运行 -jar命令： java -jar *.jar
	 * 4.都可以导入项目中的lib包运行
	 */
	public static void testJar(){
		new HelloWorld().hello();
	}
	
}
