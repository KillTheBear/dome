package com.thread.Api;

import java.util.Random;

public class Join {
    public static void main(String[] args) throws InterruptedException {
       /* Thread t = new Thread(){
            @Override
            public void run() {
               while (true){

               }
            }
        };
        t.start();
        Thread main =Thread.currentThread();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                main.interrupt();
                System.out.println("打断");
            }
        };
        t2.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    double t = new Random().nextDouble();
                    System.out.println(t);
                }
            }
        };
       Thread t1 = new Thread(){
           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                   int r = new Random().nextInt(10);
                   if (r==2){
                       try {
                           Thread.sleep(10000);
                           t2.join();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   System.out.println(r);
               }
           }
       };

        t1.start();
        t2.start();
//        t2.setPriority(Thread.MAX_PRIORITY);
    }

}
