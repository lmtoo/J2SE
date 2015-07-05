package com.somnus.designPatterns.abstractFactory;

/**
 * @Title: ComboBox.java
 * @Package com.somnus.designPatterns.abstractFactory
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:58:52
 * @version V1.0
 */
// 组合框接口：抽象产品
public interface ComboBox {
    public void display();
}

// Spring组合框类：具体产品
class SpringComboBox implements ComboBox {
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}

// Summer组合框类：具体产品
class SummerComboBox implements ComboBox {
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}