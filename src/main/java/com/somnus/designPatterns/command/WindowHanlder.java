package com.somnus.designPatterns.command;

/**
 * @Title: WindowHanlder.java
 * @Package com.somnus.designPatterns.command
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午9:27:12
 * @version V1.0
 */
// 窗口处理类：请求接收者
public class WindowHanlder {
    public void minimize() {
        System.out.println("将窗口最小化至托盘！");
    }
}

// 帮助文档处理类：请求接收者
class HelpHandler {
    public void display() {
        System.out.println("显示帮助文档！");
    }
}
