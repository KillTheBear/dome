package deamon;

public class ThreadTestMothnd {
    public static <string> void main(String[] args) {

        Runnable runnable = new CallNetBook();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(runnable, "thread:" + (i+1));
        }
        for (Thread thread : threads) {
            thread.start();
        }


    }
}
