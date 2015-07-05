package com.somnus.designPatterns.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Title: FileWriter.java
 * @Package com.somnus.designPatterns.facade
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午10:45:10
 * @version V1.0
 */
//文件保存类，充当子系统类
public class FileWriter {
	public void write(String encryptStr, String fileNameDes) {
		System.out.println("保存密文，写入文件。");
		OutputStream os = null;
		try {
			os = new FileOutputStream(fileNameDes);
			byte[] str = encryptStr.getBytes();
			os.write(str, 0, str.length);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
