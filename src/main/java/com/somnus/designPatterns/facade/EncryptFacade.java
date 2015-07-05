package com.somnus.designPatterns.facade;

/**
 * @Title: EncryptFacade.java
 * @Package com.somnus.designPatterns.facade
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午10:49:46
 * @version V1.0
 */
// 加密外观类，充当外观类
public class EncryptFacade {
	// 维持对其他对象的引用
	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;

	public EncryptFacade() {
		reader = new FileReader();
		cipher = new CipherMachine();
		writer = new FileWriter();
	}

	// 调用其他对象的业务方法
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}
}
