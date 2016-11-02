package com.thoughtworks.jdkLogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
  
  public static void main(String[] args) {
    //创建记录器logger,指定日志记录器严重性级别
    Logger logger = Logger.getLogger("loggerDemo");
    logger.setLevel(Level.ALL);
    
    //使用默认的格式化方法
    
    //创建控制台处理器,把日志输出到控制台中,以及配置处理控制套日志的严重性级别
    ConsoleHandler consoleHandler =  new ConsoleHandler();
    consoleHandler.setLevel(Level.ALL);
    logger.addHandler(consoleHandler);
    
    logger.severe("severe info");
    logger.warning("warning info");
    logger.info("normal info");
    
    logger.config("setting info");
    logger.fine("detail info");
    logger.finer("more detail info");
    logger.finest("most detail info");
  }
}
