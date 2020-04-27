package main.java.jackpot.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: hanjt
 * @Date: 2018/9/14 11:20
 * @Description:
 */

public class MyThread {

    public static void main(String[] args) throws InterruptedException {
        FutureTask<Integer> task = new FutureTask<Integer>(new CallableImpl());
        Thread thread = new Thread(task);
        thread.start();
        try {
            System.out.println("task.get() returns " + task.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class CallableImpl implements Callable<Integer> {

    private static Integer value = 0;

    @Override
    public Integer call() throws Exception {
        System.out.println("执行call方法之前 value ： " + value);
        value = value.intValue() + 1;
        System.out.println("执行call方法之后 value ： " + value);
        return value;
    }
}
