package com.somnus.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/** 
 * @Title: PhoneNumber.java 
 * @Package com.somnus.xstream 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月30日 下午5:47:58 
 * @version V1.0 
 */
public class PhoneNumber {
    @XStreamAlias("code")
    private int code;
    @XStreamAlias("number")
    private String number;
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
}
