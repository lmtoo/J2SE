package com.somnus.designPatterns.visitor;

/** 
 * @Title: Employee.java 
 * @Package com.somnus.designPatterns.visitor 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午4:58:10 
 * @version V1.0 
 */
//员工类：抽象元素类
public interface Employee {
    public void accept(Department handler); //接受一个抽象访问者访问 
}
