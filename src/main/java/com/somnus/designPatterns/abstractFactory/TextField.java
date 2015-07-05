package com.somnus.designPatterns.abstractFactory;

/**
 * @Title: TextField.java
 * @Package com.somnus.designPatterns.abstractFactory
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:58:16
 * @version V1.0
 */
// 文本框接口：抽象产品
public interface TextField {
    public void display();
}

// Spring文本框类：具体产品
class SpringTextField implements TextField {
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}

// Summer文本框类：具体产品
class SummerTextField implements TextField {
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
