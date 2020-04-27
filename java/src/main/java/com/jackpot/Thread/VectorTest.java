package main.java.jackpot.Thread;

import java.util.Vector;

/**
 * @Author: hanjt
 * @Date: 2018/10/12 14:01
 * @Description: 对vector线程安全的测试
 */
public class VectorTest {

    public static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while (true) {
            for (int i = 0, j = 10; i < j; i++) {
                vector.add(i);
            }

            Thread removeThread = new Thread(() -> {
                /**
                 * 虽然vector是线程安全的，但是在多线程操作时,在调用端还是需要进行相应的同步策略，
                 * 因为我们不能保证在我们运用一个线程操作数据时，另一个线程对数据是否发生改变。
                 * 故而我们创建线程对数据操作时，最好加上synchronized字段，对我们操作的对象做同步。
                 */
                synchronized (vector) {
                    for (int i = 0, j = 10; i < j; i++) {
                        vector.remove(i);
                    }
                }
            });

            Thread printThread = new Thread(() -> {
                synchronized (vector) {
                    for (int i = 0, j = 10; i < j; i++) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            });

            removeThread.start();
            printThread.start();

            while (Thread.activeCount() > 5) ;

        }
    }
}
