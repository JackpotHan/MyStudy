package com.jackpotHan.mess;

/**
 * @Author: hanjt
 * @Date: 2018/11/12 10:21
 * @Description:
 */
public class ErrorTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 0;
        try {
            Integer C = a / b;
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println(0);
        }
    }
}
