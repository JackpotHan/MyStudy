package com.jackPotHan;

/**
 * @Author: hanjt
 * @Date: 2018/9/10 16:08
 * @Description:
 */
public class ThreadTest {
//    public static void main(String[] args) {
//        System.out.println(0.1+0.002);
//    }
    public static void main(String[] args){
        System.out.println("当前线程是:" + Thread.currentThread().getName());
        for(int i=0,n=10; i<n; i++){
            new Thread(String.valueOf(i)){
                public void run(){
                    System.out.println("当前线程是:Thread" + getName() + " "+"running");
                }
            }.start();
        }
    }
}
