package com.thread.Api;

import org.omg.CORBA.TRANSACTION_MODE;

public class TestThreadEnd {
    public static void main(String[] args) {
        ThreadServer te = new ThreadServer();
        long start = System.currentTimeMillis();
        te.Server(()->{
            while (true){

            }
        });
        long end = System.currentTimeMillis();
        te.Shoudown(10000);
        System.out.println(end-start);
    }
}
