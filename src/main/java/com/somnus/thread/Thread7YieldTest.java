/**
 * 
 */
package com.somnus.thread;

/**
 * @Title: Thread7Test.java
 * @Package com.somnus.thread
 * @Description: yield，表示暂停当前线程，执行其他线程(包括自身线程) 由cpu决定
 * @author Somnus
 * @date 2015年4月26日 下午3:00:16
 * @version V1.0
 */
public class Thread7YieldTest {
	
	public static void main(String[] args) throws InterruptedException {
		Yield y = new Yield();
		Thread t = new Thread(y);
		t.start();
		for(int i = 0;i<100;i++){
			if(i%5==0) Thread.yield();
			System.out.println("main:"+i);
		}
	}
}
class Yield implements Runnable{
    @Override
    public void run() {
    	for(int i=0;i<100;i++){
    		System.out.println(Thread.currentThread().getName()+":Thread running....");
    	}
    }
}