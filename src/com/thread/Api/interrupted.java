package com.thread.Api;

public class interrupted {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        System.out.println("收到打断信号");
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        System.out.println("现在线程是中断状态嘛?"+t.isInterrupted());
        t.interrupt();
        System.out.println("现在线程是中断状态嘛?"+t.isInterrupted());
        t.interrupt();
        System.out.println("现在线程是中断状态嘛?"+t.isInterrupted());


    }
}
