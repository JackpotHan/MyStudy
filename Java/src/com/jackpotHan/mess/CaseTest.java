package com.jackpotHan.mess;

import java.util.*;

/**
 * @Author: hanjt
 * @Date: 2018/10/12 10:55
 * @Description:
 */
public class CaseTest {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        for (Integer v : values) {
            switch (v) {
                case 1:
                    System.out.println("111111");
                    break;
                case 2:
                    System.out.println("22222");
                    System.out.println((int)9.99);
                    break;
                default:
                    System.out.println("未知数！！！");
                    System.out.println((byte)300);
            }
        }
    }
}
