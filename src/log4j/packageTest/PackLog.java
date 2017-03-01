/*
 * PackLog.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package log4j.packageTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 针对特定包的日志控制-配置的信息只对特定包有效
 * @author LT
 * @version 1.0, 2015年9月17日
 */
public class PackLog {
	private static Logger logger = LoggerFactory.getLogger(PackLog.class);
	public static void main(String[] args) {
        logger.debug("This is packlog debug");  
        logger.info("This is packlog info");  
        logger.error("This is packlog error");  
	}
}
