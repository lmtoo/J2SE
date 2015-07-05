package com.somnus.designPatterns.facade;

/**
 * @Title: AbstractEncryptFacade.java
 * @Package com.somnus.designPatterns.facade
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月26日 上午9:10:54
 * @version V1.0
 */
public abstract class AbstractEncryptFacade {
    public abstract void fileEncrypt(String fileNameSrc, String fileNameDes);
}

class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader reader;
    private NewCipherMachine cipher;
    private FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        cipher = new NewCipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}