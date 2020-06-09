package com.thread.Api;

public class ThreadServer {
    private Thread exThread;
    private boolean flga = false;
    public void Server(Runnable task){
        exThread = new Thread(){
            @Override
            public void run() {
                Thread runner = new Thread(task);
                runner.setDaemon(true);
                runner.start();
                try {
                    runner.join();
                    flga = true;
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                }
            }
        };
        exThread.start();
    }
    public void Shoudown(long mills){
        long currenTime = System.currentTimeMillis();
        while (!flga){
          if(System.currentTimeMillis()-currenTime>=mills){
              System.out.println("超时");
              exThread.interrupt();
              break;
          }
        }

    }
}
