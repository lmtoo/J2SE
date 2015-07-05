package com.somnus.designPatterns.simpleFactory;

/** 
 * @Title: ChartFactory.java 
 * @Package com.somnus.designPatterns.simpleFactory 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:19:25 
 * @version V1.0 
 */
public class ChartFactory {
    //静态工厂方法  
    public static Chart getChart(String type) {  
        Chart chart = null;  
        if (type.equalsIgnoreCase("histogram")) {  
            chart = new HistogramChart();  
            System.out.println("初始化设置柱状图！");  
        }  
        else if (type.equalsIgnoreCase("pie")) {  
            chart = new PieChart();  
            System.out.println("初始化设置饼状图！");  
        }  
        else if (type.equalsIgnoreCase("line")) {  
            chart = new LineChart();  
            System.out.println("初始化设置折线图！");              
        }  
        return chart;  
    }  
}
