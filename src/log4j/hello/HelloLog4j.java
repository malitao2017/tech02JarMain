/*
 * HelloLog4j.java
 * Copyright: TsingSoft (c) 2015
 * Company: 北京清软创新科技有限公司
 */
package log4j.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * log4j测试类
 * @author LT
 * @version 1.0, 2015年9月17日
 */
public class HelloLog4j {
	private static Logger logger = LoggerFactory.getLogger(HelloLog4j.class);
	public static void main(String[] args){
		logger.debug("this is debug");
		logger.info("this is info");
		logger.error("this is error");
		
		//级别判断
        if(logger.isDebugEnabled()){
        	logger.debug("true debug");
        }
        if(logger.isInfoEnabled()){
        	logger.info("true info");
        }
	}
	
}
