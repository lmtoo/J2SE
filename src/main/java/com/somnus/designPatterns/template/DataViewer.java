package com.somnus.designPatterns.template;

/**
 * @Title: DataViewer.java
 * @Package com.somnus.designPatterns.template
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午10:21:05
 * @version V1.0
 */
public abstract class DataViewer {
    // 抽象方法：获取数据
    public abstract void getData();

    // 具体方法：转换数据
    public void convertData() {
        System.out.println("将数据转换为XML格式。");
    }

    // 抽象方法：显示数据
    public abstract void displayData();

    // 钩子方法：判断是否为XML格式的数据
    public boolean isNotXMLData() {
        return true;
    }

    // 模板方法
    public void process() {
        getData();
        // 如果不是XML格式的数据则进行数据转换
        if (isNotXMLData()) {
            convertData();
        }
        displayData();
    }
}

class XMLDataViewer extends DataViewer{
    // 实现父类方法：获取数据
    public void getData() {
        System.out.println("从XML文件中获取数据。");
    }

    // 实现父类方法：显示数据，默认以柱状图方式显示，可结合桥接模式来改进
    public void displayData() {
        System.out.println("以柱状图显示数据。");
    }

    // 覆盖父类的钩子方法
    public boolean isNotXMLData() {
        return false;
    }
}