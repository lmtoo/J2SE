package com.somnus.designPatterns.decorator;

/**
 * @Title: ComponentDecorator.java
 * @Package com.somnus.designPatterns.decorator
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午5:26:49
 * @version V1.0
 */
// 构件装饰类：抽象装饰类
public class ComponentDecorator extends Component {
    private Component component; // 维持对抽象构件类型对象的引用
    // 注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}

// 滚动条装饰类：具体装饰类
class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}

//黑色边框装饰类：具体装饰类
class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}