package com.somnus.designPatterns.facade;

import org.junit.Test;

public class Client {
    
    @Test
	public void main() {
	    EncryptFacade ef = new EncryptFacade();  
        ef.fileEncrypt("com/somnus/designPatterns/facade/src.txt", 
                "target/classes/des.txt");
	}
    
    @Test
    public void main2() throws Exception {
        AbstractEncryptFacade ef = (AbstractEncryptFacade) XMLUtil.getBean(); 
        ef.fileEncrypt("com/somnus/designPatterns/facade/src.txt", 
                "target/classes/des.txt");
    }

}
