package com.somnus.designPatterns.strategy;

/**
 * @Title: Discount.java
 * @Package com.somnus.designPatterns.strategy
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午9:56:32
 * @version V1.0
 */
// 折扣类：抽象策略类
public interface Discount {
    public double calculate(double price);
}

// 学生票折扣类：具体策略类
class StudentDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}

// 儿童票折扣类：具体策略类
class ChildrenDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}

// VIP会员票折扣类：具体策略类
class VIPDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}