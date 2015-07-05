package com.somnus.designPatterns.prototype;

public class Client2 {
    public static void main(String[] args) {
        WeeklyLog2 log_previous = new WeeklyLog2(); //创建原型对象
        Attachment2  attachment = new Attachment2(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        WeeklyLog2 log_new  = log_previous.clone(); //调用克隆方法创建克隆对象
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous ==  log_new));
        //比较附件
        System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
