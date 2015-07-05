package com.somnus.designPatterns.proxy;

/** 
 * @Title: Logger.java 
 * @Package com.somnus.designPatterns.proxy 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午6:03:02 
 * @version V1.0 
 */
public class Logger {
    //模拟实现日志记录  
    public void log(String userId) {  
        System.out.println(String.format("更新数据库，用户'%s'查询次数加1", userId));
    } 
}