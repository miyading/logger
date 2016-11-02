package com.thoughtworks.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {
  public static void main(String[] args) {
    //创建记录器logger
    Logger logger = Logger.getLogger(Test.class);
    
    //配置log,默认是从项目根目录开始读取的
    PropertyConfigurator.configure("src/main/java/com/thoughtworks/log4j/log4j.properties");
    
    logger.debug("debug msg");
    logger.info("info msg");
    logger.error("error msg");
  }
}
