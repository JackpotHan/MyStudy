package com.jackPotHan;

import java.util.Random;

/**
 * @Author: hanjt
 * @Date: 2018/9/18 10:35
 * @Description: 使用synchronized同步块实现简单售票系统
 */
public class SellTicket implements Runnable {
    public int count;

    public SellTicket() {
        count = 100;
    }

    public void startSell(){
        while (count > 0) {
            synchronized (SaleTicket.class) {
                if (count > 0) {
                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "\t当前票号：" + count--);
                }
            }
        }
    }

    public void run() {
        startSell();
    }

    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        for (int i = 1; i <= 5; i++) {
            new Thread(st, "售票点：" + i).start();
        }
    }

}

/**
 *
 * 当两个并发线程访问同一个对象（实例）中的这个synchronized(SaleTicket.class)
 * 当一个线程访问object的一个synchronized(SaleTicket.class)同步代码块时，
 * 另一个线程仍然可以访问该object中的非synchronized(this)同步代码块,
 * 所以线程“售票点：5”也有机会执行同步块。
 *
 * 尤其关键的是，当一个线程访问object的一个synchronized(SaleTicket.class)同步代码块时，
 * 其他线程对object中所有其它synchronized(SaleTicket.class)同步代码块的访问将被阻塞,也就是说，
 * 当一个线程访问object的一个synchronized(SaleTicket.class)同步代码块时，它就获得了这个object的对象锁。
 * 结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。（这种同步块方式缩小了需要安全的地方，同时也加强了程序运行的效率）
 *
 **/