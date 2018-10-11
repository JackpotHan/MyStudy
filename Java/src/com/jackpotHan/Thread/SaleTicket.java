package com.jackpotHan.Thread;

import java.util.Random;

/**
 * @Author: hanjt
 * @Date: 2018/9/18 10:32
 * @Description: 使用synchronized方法实现简单售票系统
 */
public class SaleTicket implements Runnable {

    public int count;

    public SaleTicket() {
        count = 100;
    }

    public synchronized void startSale(){
        while (count > 0) {
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

    public void run() {
        startSale();
    }

    public static void main(String[] args) {
        SaleTicket st = new SaleTicket();
        for (int i = 1; i <= 5; i++) {
            new Thread(st, "售票点：" + i).start();
        }
    }

}

/**
 *
 * synchronized应用到方法上，是得到了该对象（实例）的锁，
 * 对象（实例）锁特点是：哪个线程售票点获得该对象（实例）将会独自执行完毕（也就是独自持有"锁"），
 * 所以售票点：1先得到了锁，所以一直是它把所有的票都卖完！
 *
 * Synchronized 方法控制对类成员的访问：每个类实例对应一把锁，
 * 每个synchronized方法都必须获得调用该方法的实例的锁方能执行，
 * 否则所属线程阻塞，方法一旦 执行，就独占该锁，直到从该方法返回时才将锁释放，
 * 此后被阻塞的线程方能获得该锁，重新进入可执行状态。这种机制确保同一时刻对于每一个实例，
 * 其所声明为 synchronized的成员函数中至多只有一个处于可执行的状态（因为至多只有一个能够获得该实例对应的锁），
 * 从而有效的避免了类成员变量的访问冲突。（多线程并发执行的时候只能有一个线程执行synchronized method（）｛....｝）
 *
 **/