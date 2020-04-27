package com.jackpotHan.Java8;

/**
 * @Author: hanjt
 * @Date: 2018/12/12 18:10
 * @Description:
 */
public class SwapTest {
    public static void main(String[] args) {
        //String x = "x111";
        //String y = "y111";
        String x = new String("x111");
        String y = new String("y111");
        swap(x, y);
        System.out.println(x);
        System.out.println(y);
    }

    public static void swap(String a, String b)
    {
        String temp = a;
        a = b;
        b = temp;
    }

}
