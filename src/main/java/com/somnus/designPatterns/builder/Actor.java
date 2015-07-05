package com.somnus.designPatterns.builder;

/**
 * @Title: Actor.java
 * @Package com.somnus.designPatterns.builder
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月24日 下午3:34:10
 * @version V1.0
 */
//Actor角色类：复杂产品，考虑到代码的可读性，只列出部分成员属性，且成员属性的类型均为String，真实情况下，有些成员属性的类型需自定义
public class Actor {
    /*角色类型*/
    private String type;
    /*性别*/
    private String sex;
    /*脸型*/
    private String face; 
    /*服装*/
    private String costume;
    /*发型*/
    private String hairstyle;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getFace() {
        return face;
    }
    public void setFace(String face) {
        this.face = face;
    }
    public String getCostume() {
        return costume;
    }
    public void setCostume(String costume) {
        this.costume = costume;
    }
    public String getHairstyle() {
        return hairstyle;
    }
    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

}
