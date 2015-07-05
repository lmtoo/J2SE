package com.somnus.designPatterns.proxy;

/** 
 * @Title: AccessValidator.java 
 * @Package com.somnus.designPatterns.proxy 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午6:03:38 
 * @version V1.0 
 */
public class AccessValidator {
    // 模拟实现登录验证
    public boolean validate(String userId) {
        System.out.println(String.format("在数据库中验证用户'%s'是否是合法用户？", userId));
        if (userId.equals("杨过")) {
            System.out.println(userId + "登录成功！");
            return true;
        } else {
            System.out.println(userId + "登录失败！");
            return false;
        }
    }
}
