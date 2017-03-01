/*
 * FileLoc.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package log4j.zFileLocation;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 配置文件log4j.properties 的路径问题 - 手动模式目前有问题
 * @author LT
 * @version 1.0, 2015年9月17日
 */
public class FileLoc {
	private static Logger logger = LoggerFactory.getLogger(FileLoc.class);
	public static void main(String[] args) {
//		PropertyConfigurator.configure("log4j.properties"); //放于：tech02JarMain/log4j.properties
//		PropertyConfigurator.configure("config/log4j.properties");//放于：tech02JarMain/config/log4j.properties
		logger.debug("This is packlog debug");  
        logger.info("This is packlog info");  
        logger.error("This is packlog error");  
	}
}
