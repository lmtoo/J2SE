package com.somnus.designPatterns.abstractFactory;

/**
 * @Title: Button.java
 * @Package com.somnus.designPatterns.abstractFactory
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:57:43
 * @version V1.0
 */
// 在本实例中我们对代码进行了大量简化，实际使用时，界面组件的初始化代码较为复杂，还需要使用JDK中一些已有类，为了突出核心代码，在此只提供框架代码和演示输出。
// 按钮接口：抽象产品
public interface Button {
    public void display();
}

// Spring按钮类：具体产品
class SpringButton implements Button {
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}

// Summer按钮类：具体产品
class SummerButton implements Button {
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}