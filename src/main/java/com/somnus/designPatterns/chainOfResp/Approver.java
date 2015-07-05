package com.somnus.designPatterns.chainOfResp;

/**
 * 
 * @Title: Approver.java
 * @Package com.somnus.designPatterns.chainOfResp
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午5:21:58
 * @version V1.0
 */
// 审批者类：抽象处理者
public abstract class Approver {
    protected Approver successor; // 定义后继对象
    protected String name; // 审批者姓名

    public Approver(String name) {
        this.name = name;
    }

    // 设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    // 抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}

// 主任类：具体处理者
class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    // 具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。"); // 处理请求
        } else {
            this.successor.processRequest(request); // 转发请求
        }
    }
}

// 副董事长类：具体处理者
class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    // 具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。"); // 处理请求
        } else {
            this.successor.processRequest(request); // 转发请求
        }
    }
}

// 董事长类：具体处理者
class President extends Approver {
    public President(String name) {
        super(name);
    }

    // 具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。"); // 处理请求
        } else {
            this.successor.processRequest(request); // 转发请求
        }
    }
}

// 董事会类：具体处理者
class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    // 具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的："
                + request.getPurpose() + "。"); // 处理请求
    }
}