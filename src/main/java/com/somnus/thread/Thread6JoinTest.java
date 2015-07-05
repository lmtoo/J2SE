/**
 * 
 */
package com.somnus.thread;

/**
 * @Title: Thread6Test.java
 * @Package com.somnus.thread
 * @Description: 在很多情况下，主线程生成并起动了子线程，如果子线程里要进行大量的耗时的运算，
 * 主线程往往将于子线程之前结束，但是如果主线程处理完其他的事务后，需要用到子线程的处理结果，
 * 也就是主线程需要等待子线程执行完成之后再结束，这个时候就要用到join()方法了。
 * 
 * 即join()的作用是：“等待该线程终止”，这里需要理解的就是该线程是指的主线程等待子线程的终止。
 * 也就是在子线程调用了join()方法后面的代码，只有等到子线程结束了才能执行。 
 * @author Somnus
 * @date 2015年4月26日 下午3:00:16
 * @version V1.0
 */
public class Thread6JoinTest {
	
	public static void main(String[] args) throws InterruptedException {
		Join j = new Join();
		Thread t = new Thread(j);
		t.start();
		for(int i = 0;i<100;i++){
			if(i==10) t.join();
			System.out.println("main:"+i);
		}
	}
}
class Join implements Runnable{
    @Override
    public void run() {
    	for(int i=0;i<100;i++){
    		System.out.println(Thread.currentThread().getName()+":Thread running....");
    	}
    }
}