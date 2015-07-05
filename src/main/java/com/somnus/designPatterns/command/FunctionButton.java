package com.somnus.designPatterns.command;

/**
 * @Title: FunctionButton.java
 * @Package com.somnus.designPatterns.command
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午9:25:56
 * @version V1.0
 */
public class FunctionButton {
    private String name; // 功能键名称
    private Command command; // 维持一个抽象命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    // 发送请求的方法
    public void onClick() {
        System.out.print("点击功能键：");
        command.execute();
    }
}
