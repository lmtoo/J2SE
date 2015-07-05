package com.somnus.designPatterns.visitor;

/** 
 * @Title: Department.java 
 * @Package com.somnus.designPatterns.visitor 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午5:00:25 
 * @version V1.0 
 */
//部门类：抽象访问者类
public abstract class Department {
    //声明一组重载的访问方法，用于访问不同类型的具体元素  
    public abstract void visit(FulltimeEmployee employee);  
    public abstract void visit(ParttimeEmployee employee); 
}
