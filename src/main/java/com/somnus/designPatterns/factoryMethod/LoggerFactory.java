package com.somnus.designPatterns.factoryMethod;

/**
 * @Title: LoggerFactory.java
 * @Package com.somnus.designPatterns.factoryMethod
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:46:51
 * @version V1.0
 */
// 日志记录器工厂接口：抽象工厂
public interface LoggerFactory {
    public Logger createLogger();
}

// 数据库日志记录器工厂类：具体工厂
class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        // 连接数据库，代码省略
        // 创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return logger;
    }
}

// 文件日志记录器工厂类：具体工厂
class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        // 创建文件日志记录器对象
        Logger logger = new FileLogger();
        // 创建文件，代码省略
        return logger;
    }
}
