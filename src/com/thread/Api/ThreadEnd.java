package com.thread.Api;

public class ThreadEnd {
    public static void main(String[] args) {
/**
 * 优雅的结束线程
 */
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true){
                  if(Thread.interrupted()){
                      break;
                  }
                }
            }
        };
        t.start();
        t.interrupt();
    }
}



