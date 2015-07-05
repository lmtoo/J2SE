package com.somnus.designPatterns.abstractFactory;

/**
 * @Title: SkinFactory.java
 * @Package com.somnus.designPatterns.abstractFactory
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:59:25
 * @version V1.0
 */
// 界面皮肤工厂接口：抽象工厂
public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}

// Spring皮肤工厂：具体工厂
class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}

// Summer皮肤工厂：具体工厂
class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
