package com.somnus.designPatterns.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Title: FileReader.java
 * @Package com.somnus.designPatterns.facade
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 下午10:36:10
 * @version V1.0
 */
//文件读取类，充当子系统类
public class FileReader {
	public String read(String fileNameSrc) {
		System.out.println("读取文件，获取明文：");
		InputStream is = null;
		StringBuilder sb = new StringBuilder();
		try {
			is = getClass().getClassLoader().getResourceAsStream(fileNameSrc);
			int data;
			while ((data = is.read()) != -1) {
				sb = sb.append((char) data);
			}
			is.close();
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
