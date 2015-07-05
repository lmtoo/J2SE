package com.somnus.designPatterns.decorator;

/**
 * 
 * @Title: Component.java 
 * @Package com.somnus.designPatterns.decorator 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月28日 下午3:48:17 
 * @version V1.0
 */
//抽象界面构件类：抽象构件类，为了突出与模式相关的核心代码，对原有控件代码进行了大量的简化
public abstract class Component {
    public abstract void display();
}

//窗体类：具体构件类
class Window extends Component{
    public void display(){
        System.out.println("显示窗体！");
    }
}

//文本框类：具体构件类
class TextBox extends Component{
    public void display(){
        System.out.println("显示文本框！");
    }
}

//列表框类：具体构件类
class ListBox extends Component{
    public void display(){
        System.out.println("显示列表框！");
    }
}