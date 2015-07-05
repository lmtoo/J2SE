package com.somnus.designPatterns.abstractFactory;

public class Client {

    public static void main(String[] args) throws Exception {
        //使用抽象层定义  
        SkinFactory factory = (SkinFactory)XMLUtil.getBean();  
        Button bt = factory.createButton();  
        TextField tf = factory.createTextField();  
        ComboBox cb = factory.createComboBox();  
        bt.display();  
        tf.display();  
        cb.display(); 
    }

}
