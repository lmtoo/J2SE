package com.somnus.designPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: AbstractObjectList.java 
 * @Package com.somnus.designPatterns.iterator 
 * @Description: TODO
 * @author yh.liu
 * @date 2015年6月26日 上午11:45:05 
 * @version V1.0 
 */
//在本实例中，为了详细说明自定义迭代器的实现过程，我们没有使用JDK中内置的迭代器，事实上，JDK内置迭代器已经实现了对一个List对象的正向遍历
abstract class AbstractObjectList {  
  protected List<Object> objects = new ArrayList<Object>();  

  public AbstractObjectList(List objects) {  
      this.objects = objects;  
  }  
    
  public void addObject(Object obj) {  
      this.objects.add(obj);  
  }  
    
  public void removeObject(Object obj) {  
      this.objects.remove(obj);  
  }  
    
  public List getObjects() {  
      return this.objects;  
  }  
    
  //声明创建迭代器对象的抽象工厂方法  
  public abstract AbstractIterator createIterator();  
}  

//商品数据类：具体聚合类  
class ProductList extends AbstractObjectList {  
  public ProductList(List products) {  
      super(products);  
  }  
    
  //实现创建迭代器对象的具体工厂方法  
  public AbstractIterator createIterator() {  
      return new ProductIterator(this);  
  }  
}   