package com.somnus.thread;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadTest14Timer{
    static class MyTimerTask1 extends TimerTask {  
        public void run() {  
            System.out.println("爆炸！！！");  
            new Timer().schedule(new MyTimerTask2(), 2000);  
        }  
    }  
    static class MyTimerTask2 extends TimerTask {  
        public void run() {  
            System.out.println("爆炸！！！");  
            new Timer().schedule(new MyTimerTask1(), 3000);  
        }  
    }  
    public static void main(String[] args) {  
        Timer timer = new Timer();  
        timer.schedule(new MyTimerTask2(), 2000);  
        while(true) {  
            System.out.println(Calendar.SECOND);  
            try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}