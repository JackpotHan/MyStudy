package com.jackpotHan.Java8;

/**
 * @Author: hanjt
 * @Date: 2018/12/13 14:33
 * @Description:
 */
public class Test1 {

    private static int x=10;

    public static void updateValue(int value){
        value = 3 * value;
    }

    public static void main(String[] args) {
        System.out.println("调用前x的值："+x);
        updateValue(x);
        System.out.println("调用后x的值："+x);
    }

}
