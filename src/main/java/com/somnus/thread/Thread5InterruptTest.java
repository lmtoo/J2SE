/**
 * 
 */
package com.somnus.thread;

/**
 * @Title: Thread5Test.java
 * @Package com.somnus.thread
 * @Description: 我们一直以来都有一个错误的理解，认为interrupt会使线程停止运行，但事实上并非如此，
 * 调用一个线程的interrupt方法会把线程的状态改为中断态，但是interrupt方法只作用于那些因为执行了sleep、wait、join方法而休眠的线程，
 * 使他们不再休眠，同时会抛出InterruptedException异常。
 * 
 * 比如一个线程A正在sleep中，这时候另外一个程序里去调用A的interrupt方法，
 * 这时就会迫使A停止休眠而抛出InterruptedException异常；而如果线程A没有处于上面提到的三种休眠状态时被interrupt，
 * 这样就只是把线程A的状态改为interrupted，但是不会影响线程A的继续执行。
 * 
 * 如何停止一个线程呢？用stop方法吗？肯定不行，这个方法由于不安全已经过时，不推荐使用
 * @author Somnus
 * @date 2015年4月26日 下午3:00:16
 * @version V1.0
 */
public class Thread5InterruptTest {
	/**
	 * 在这里主线程和子线程是交替执行的，别混淆噢
	 * 可能在i=10的时候，子线程已经执行过5次，也可能是12次，也会是N次，
	 * 但一旦轮到主线程执行到那个if语句成立的时候，子线程立马停止运行，以后只会是主线程的天下
	 * @param args
	 */
	public static void main(String[] args) {
		Stop stop = new Stop();
		new Thread(stop).start();
		for(int i = 1;i<=100;i++){
			if(i==10) stop.stop();
			System.out.println("main:"+i);
		}
	}
}
class Stop implements Runnable{
	private volatile boolean flag = true;
    @Override
    public void run() {
    	int count = 0;
    	while(flag){
			System.out.println(Thread.currentThread().getName()+":Thread running...."+count++);
		}
    }
    public void stop(){
    	this.flag = false;
    }
}