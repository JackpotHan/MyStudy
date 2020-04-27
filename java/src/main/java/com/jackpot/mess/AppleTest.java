package com.jackpot.mess;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hanjt
 * @Date: 2018/7/18 15:43
 * @Description:
 */
public class AppleTest {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();//存放apple对象集合

        Apple apple1 =  new Apple(1,"苹果1",new BigDecimal("3.25"),10);
        Apple apple12 = new Apple(1,"苹果2",new BigDecimal("1.35"),20);
        Apple apple2 =  new Apple(2,"香蕉",new BigDecimal("2.89"),30);
        Apple apple3 =  new Apple(3,"荔枝",new BigDecimal("9.99"),40);

        appleList.add(apple1);
        appleList.add(apple12);
        appleList.add(apple2);
        appleList.add(apple3);

        /**
         * T reduce(T identity, BinaryOperator<T> accumulator);
         * $.reduce(恒等式（值），操作运算符)
         * BigDecimal::add  '＋'
         * BigDecimal::subtract  '-'
         * BigDecimal::multiply '*'
         * BigDecimal::divideToIntegralValue '/'  除数是整形
         */
        BigDecimal totalMoney = appleList.stream().map(Apple::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalAmt =appleList.stream().map(Apple::getMoney).reduce(BigDecimal.ONE,BigDecimal::multiply);
        System.err.println("totalMoney:"+totalMoney+",totolAmt:"+totalAmt);

    }
}
