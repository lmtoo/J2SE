package com.somnus.designPatterns.simpleFactory;

/** 
 * @Title: Chart.java 
 * @Package com.somnus.designPatterns.simpleFactory 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:18:00 
 * @version V1.0 
 */
//抽象图表接口：抽象产品类  
public interface Chart {  
  public void display();  
}  

//柱状图类：具体产品类  
class HistogramChart implements Chart {  
  public HistogramChart() {  
      System.out.println("创建柱状图！");  
  }  
    
  public void display() {  
      System.out.println("显示柱状图！");  
  }  
}  

//饼状图类：具体产品类  
class PieChart implements Chart {  
  public PieChart() {  
      System.out.println("创建饼状图！");  
  }  
    
  public void display() {  
      System.out.println("显示饼状图！");  
  }  
}  

//折线图类：具体产品类  
class LineChart implements Chart {  
  public LineChart() {  
      System.out.println("创建折线图！");  
  }  
    
  public void display() {  
      System.out.println("显示折线图！");  
  }  
}  
