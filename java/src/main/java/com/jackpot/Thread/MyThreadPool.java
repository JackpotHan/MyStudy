package main.java.jackpot.Thread;

import java.util.concurrent.*;

/**
 * @Author: hanjt
 * @Date: 2018/9/14 11:18
 * @Description:
 */

public class MyThreadPool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(20));
        Future task;
        for (int i = 0; i < 5; i++) {
            task = executor.submit(new CallableImpl());
            System.out.println("线程返回结果：" + task.get());
        }
        executor.shutdown();
    }
}




