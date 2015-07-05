package com.somnus.designPatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: EmployeeList.java
 * @Package com.somnus.designPatterns.visitor
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午5:02:03
 * @version V1.0
 */
// 员工列表类：对象结构
public class EmployeeList {
    // 定义一个集合用于存储员工对象
    private List<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    // 遍历访问员工集合中的每一个员工对象
    public void accept(Department handler) {
        for (Object obj : list) {
            ((Employee) obj).accept(handler);
        }
    }
}
