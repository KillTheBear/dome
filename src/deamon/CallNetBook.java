package deamon;

import java.util.HashMap;
import java.util.Scanner;

public class CallNetBook implements Runnable {
    private final String stu_tel = "124";
    private String name;
    private String address;
    private String tel;
    @Override
    public void run() {
        HashMap<String,AddressList> studentList =new HashMap<String,AddressList>();
        AddressList AL = new AddressList(name,address,tel);
        for (int i = 0; i <10 ; i++) {
            System.out.println("输入你的姓名：name=");
            name = new Scanner(System.in).next();
            System.out.println("输入你的地址：address=");
            address = new Scanner(System.in).next();
            System.out.println("输入你的电话：tel=");
            tel = new Scanner(System.in).next();
            studentList.put(tel,AL);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(stu_tel.equals(studentList.keySet())) {
            System.out.println(Thread.currentThread().getName() + "name:"+name+"add:"+address+"tel:"+tel);
            //Thread.currentThread().getName() 获取线程的名字
        }
    }
}
