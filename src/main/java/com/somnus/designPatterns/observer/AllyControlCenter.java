package com.somnus.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: AllyControlCenter.java
 * @Package com.somnus.designPatterns.observer
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午11:32:53
 * @version V1.0
 */
// 战队控制中心类：目标类
public abstract class AllyControlCenter {
    protected String allyName; // 战队名称
    protected List<Observer> players = new ArrayList<Observer>(); // 定义一个集合用于存储战队成员

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    // 注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    // 注销方法
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    // 声明抽象通知方法
    public abstract void notifyObserver(String name);
}

// 具体战队控制中心类：具体目标类
class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    // 实现通知方法
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        // 遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for (Object obs : players) {
            if (!((Observer) obs).getName().equalsIgnoreCase(name)) {
                ((Observer) obs).help();
            }
        }
    }
}
