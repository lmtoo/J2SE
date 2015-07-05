package com.somnus.designPatterns.factoryMethod;

/**
 * @Title: Logger.java
 * @Package com.somnus.designPatterns.factoryMethod
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:46:19
 * @version V1.0
 */
// 日志记录器接口：抽象产品
interface Logger {
    public void writeLog();
}

// 数据库日志记录器：具体产品
class DatabaseLogger implements Logger {
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}

// 文件日志记录器：具体产品
class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
