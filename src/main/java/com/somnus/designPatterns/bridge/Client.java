package com.somnus.designPatterns.bridge;

public class Client {

    public static void main(String[] args) throws Exception {
        Image image = (Image)XMLUtil.getBean("image");    
        ImageImp imp = (ImageImp)XMLUtil.getBean("os");
        image.setImageImp(imp);  
        image.parseFile("小龙女");
    }

}
