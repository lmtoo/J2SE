package com.somnus.designPatterns.prototype;

/**
 * @Title: Attachment.java
 * @Package com.somnus.designPatterns.prototype
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午1:25:28
 * @version V1.0
 */
//附件类
public class Attachment2 {
    private String name; // 附件名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
