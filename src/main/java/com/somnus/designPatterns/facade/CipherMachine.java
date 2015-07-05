package com.somnus.designPatterns.facade;

/**
 * @Title: CipherMachine.java
 * @Package com.somnus.designPatterns.facade
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午10:41:58
 * @version V1.0
 */
//数据加密类，充当子系统类
public class CipherMachine {
	public String encrypt(String plainText) {
		System.out.println("数据加密，将明文转换为密文：");
		String es = "";
		char[] chars = plainText.toCharArray();
		for (char ch : chars) {
			String c = String.valueOf((ch % 7));
			es += c;
		}
		System.out.println(es);
		return es;
	}
}
