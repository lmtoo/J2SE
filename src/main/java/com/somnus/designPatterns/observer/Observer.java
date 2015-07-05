package com.somnus.designPatterns.observer;

/**
 * @Title: Observer.java
 * @Package com.somnus.designPatterns.observer
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午11:32:15
 * @version V1.0
 */
// 抽象观察类
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help(); // 声明支援盟友方法

    public void beAttacked(AllyControlCenter acc); // 声明遭受攻击方法
}

// 战队成员类：具体观察者类
class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 支援盟友方法的实现
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    // 遭受攻击方法的实现，当遭受攻击时将调用战队控制中心类的通知方法notifyObserver()来通知盟友
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }
}