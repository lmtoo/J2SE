package com.somnus.designPatterns.template;

/**
 * @Title: Account.java
 * @Package com.somnus.designPatterns.template
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午10:13:05
 * @version V1.0
 */
public abstract class Account {
    // 基本方法——具体方法
    public boolean validate(String account, String password) {
        System.out.println(String.format("账号：'%s'", account));
        System.out.println(String.format("密码：'%s'", password));
        // 模拟登录
        if (account.equals("张无忌") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }

    // 基本方法——抽象方法
    public abstract void calculateInterest();

    // 基本方法——具体方法
    public void display() {
        System.out.println("显示利息！");
    }

    // 模板方法
    public void Handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }
}

class CurrentAccount extends Account{
    @Override
    public void calculateInterest() {
      System.out.println("按活期利率计算利息！");
    }
}
class SavingAccount extends Account{
    @Override
    public void calculateInterest() {
      System.out.println("按定期利率计算利息！");
    }
}
