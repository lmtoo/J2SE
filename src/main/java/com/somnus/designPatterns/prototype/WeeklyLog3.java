package com.somnus.designPatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * @Title: WeeklyLog3.java
 * @Package com.somnus.designPatterns.prototype
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午1:33:15
 * @version V1.0
 */
public class WeeklyLog3 implements Serializable {
    private Attachment3 attachment;
    private String name;
    private String date;
    private String content;

    public void setAttachment(Attachment3 attachment) {
        this.attachment = attachment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment3 getAttachment() {
        return (this.attachment);
    }

    public String getName() {
        return (this.name);
    }

    public String getDate() {
        return (this.date);
    }

    public String getContent() {
        return (this.content);
    }

    // 使用序列化技术实现深克隆
    public WeeklyLog3 deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog3) ois.readObject();
    }
}
