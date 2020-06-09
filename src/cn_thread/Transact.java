package cn_thread;

public class Transact {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(bank).start();
        new Thread(bank).start();

    }
}




