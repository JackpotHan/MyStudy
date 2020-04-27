package main.java.jackpot.mess;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @Author: hanjt
 * @Date: 2018/10/15 14:42
 * @Description:
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(13.14);
        BigDecimal b2 = new BigDecimal(5.20);
        MathContext mc = new MathContext(4);
        BigDecimal b7 = BigDecimal.ZERO;
//        BigDecimal b3 = b1.add(b2,mc);
//        BigDecimal b4 = b1.subtract(b2);
        BigDecimal b5 = b1.divide(b2);
//        BigDecimal b5 = b1.divide(b2,mc);
////        BigDecimal b6 = b1.multiply(b2);
//        BigDecimal b6 = b1.multiply(b2,mc);
//        System.out.println(b3);
//        System.out.println(b4);
        System.out.println(b5);

//        System.out.println(b6);
        if (b7.intValue() != 0) {
            BigDecimal b8 = b1.divide(b7, mc);
            System.out.println(b8);
        }else {
            System.out.println("Division not zero");
        }
    }
}
