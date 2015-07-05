package com.somnus.designPatterns.prototype;

import java.io.Serializable;

/**
 * @Title: Attachment3.java
 * @Package com.somnus.designPatterns.prototype
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午1:32:03
 * @version V1.0
 */
public class Attachment3 implements Serializable {
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