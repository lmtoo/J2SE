package com.somnus.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
 * @Title: Animal.java 
 * @Package com.somnus.xstream 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月30日 下午5:52:36 
 * @version V1.0 
 */
public class Animal {
    @XStreamAlias("name")
    private String name;
    @XStreamAlias("age")
    private int age;
    
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
