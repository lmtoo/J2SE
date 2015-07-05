package com.somnus.designPatterns.factoryMethod;

public class Client {

    public static void main(String[] args) throws Exception {
        //getBean()的返回类型为Object，需要进行强制类型转换  
        LoggerFactory factory = (LoggerFactory)XMLUtil.getBean(); 
        Logger logger = factory.createLogger();  
        logger.writeLog();  
    }

}
