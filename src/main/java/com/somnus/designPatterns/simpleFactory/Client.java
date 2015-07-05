package com.somnus.designPatterns.simpleFactory;

public class Client {

    public static void main(String[] args) {
        //读取配置文件中的参数  
        String type = XMLUtil.getChartType(); 
        //通过静态工厂方法创建产品  
        Chart chart = ChartFactory.getChart(type); 
        chart.display(); 
    }

}
