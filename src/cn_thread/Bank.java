package cn_thread;

public class Bank implements Runnable {

    private int Save_Moneny =100;
    private int Bank_Moneny = 0;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Bank_Moneny+= Save_Moneny;
            System.out.println("当前账户余额为："+Bank_Moneny);
        }

    }
}
