package com.somnus.designPatterns.template;

public class Client {

    public static void main(String[] args) throws Exception {
        Account acc = (Account) XMLUtil.getBean();
        acc.Handle("张无忌", "123456");

        DataViewer dv = new XMLDataViewer();
        dv.process();
    }

}
