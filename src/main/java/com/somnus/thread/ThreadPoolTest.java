package com.somnus.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ThreadPoolTest{
    
    @Test
    public void thread1(){
        /*创建可以容纳3个线程的线程池 */
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 5; i++){
            final int taskID = i;
            threadPool.execute(new Runnable(){
                public void run(){
                    for (int i = 1; i < 5; i++){
                        try{
                            Thread.sleep(20);// 为了测试出效果，让每次任务执行都需要一定时间
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("第" + taskID + "次任务的第" + i + "次执行");
                    }
                }
            });
        }
        threadPool.shutdown();// 任务执行完毕，关闭线程池
    }
    
    @Test
    public void thread2(){
        /*线程池的大小会根据执行的任务数动态分配 */
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for (int i = 1; i < 5; i++){
            final int taskID = i;
            threadPool.execute(new Runnable(){
                public void run(){
                    for (int i = 1; i < 5; i++){
                        try{
                            Thread.sleep(20);// 为了测试出效果，让每次任务执行都需要一定时间
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("第" + taskID + "次任务的第" + i + "次执行");
                    }
                }
            });
        }
        threadPool.shutdown();// 任务执行完毕，关闭线程池
    }
    
    @Test
    public void thread3(){
        /*创建单个线程的线程池，如果当前线程在执行任务时突然中断，则会创建一个新的线程替代它继续执行任务*/
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        for (int i = 1; i < 5; i++){
            final int taskID = i;
            threadPool.execute(new Runnable(){
                public void run(){
                    for (int i = 1; i < 5; i++){
                        try{
                            Thread.sleep(20);// 为了测试出效果，让每次任务执行都需要一定时间
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("第" + taskID + "次任务的第" + i + "次执行");
                    }
                }
            });
        }
        threadPool.shutdown();// 任务执行完毕，关闭线程池
    }
    
    @Test
    public void thread4(){
        ScheduledExecutorService schedulePool = Executors.newScheduledThreadPool(1);  
        // 5秒后执行任务  
        schedulePool.schedule(new Runnable() {  
            public void run() {  
                System.out.println("爆炸");  
            }  
        }, 5, TimeUnit.SECONDS);  // 5秒后执行任务，以后每2秒执行一次  
        
        schedulePool.scheduleAtFixedRate(new Runnable() {  
            @Override  
            public void run() {  
                System.out.println("爆炸");  
            }  
        }, 5, 2, TimeUnit.SECONDS);  
    }
    
}
