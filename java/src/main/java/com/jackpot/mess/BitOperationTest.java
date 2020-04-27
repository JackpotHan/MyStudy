package com.jackpot.mess;

/**
 * @Author: hanjt
 * @Date: 2018/9/28 14:26
 * @Description: Java 位运算符
 */
public class BitOperationTest {

    public static void main(String[] args) {

        /**
         * Notice：
         *
         * 所有的位运算操作都是基于二进制补码进行的
         *
         * 在移位运算时，byte、short和char类型移位后的结果会变成int类型，
         * 对于byte、short、char和int进行移位时，规定:
         *      实际移动的次数是移动次数和32的余数，也就是移位33次和移位1次得到的结果相同。
         * 移动long型的数值时，规定:
         *      实际移动的次数是移动次数和64的余数，也就是移动66次和移动2次得到的结果相同。 　
         */

        System.out.println("'<<'位操作符(10 << 3):" + (10 << 3));

        System.out.println("'>>'位操作符(10 >> 3):" + (10 >> 3));

        System.out.println("'>>'位操作符(-10 >> 3):" + (-10 >> 3));

        System.out.println("'>>>'位操作符(10 >>> 35):" + (10 >>> 35));

        System.out.println("'>>>'位操作符(10 >>> 3):" + (10 >>> 3));

        System.out.println("'>>>'位操作符('a' >>> 3):" + ('a' >>> 3));

        System.out.println("'>>>'位操作符(-10 >>> 3):" + (-10 >>> 3));

        System.out.println("'&'位操作符(10 & 3):" + (10 & 3));

        System.out.println("'|'位操作符(10 | 3):" + (10 | 3));

        System.out.println("'~'位操作符(~ 10):" + (~10));

        System.out.println("'~'位操作符(~ -10):" + (~-10));

        System.out.println("'^'位操作符(10^3):"+(10^3));

        System.out.println("'^'位操作符(9^3):"+(9^3));

        System.out.println("'^'位操作符(9^10):"+(9^10));

        System.out.println("'~'位操作符(~ 'a'):" + (~'a'));   

    }
}
