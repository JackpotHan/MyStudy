package com.jackPotHan.myTest;

import java.util.function.Consumer;

/**
 * @Author: Hanjt
 * @Date: 2018/7/17 10:21
 * @Description:
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!Java");
        System.out.println("--------------------");
        System.out.println("'ab'=='a'+'b'");
        System.out.println("----已下是lambda表达式相关测试-----");
        Consumer<String> c = s -> System.out.println(s);   //消费者
        c.accept("Lambda ThreadTest");
    }
}
