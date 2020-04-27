package com.jackpot.Java8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: hanjt
 * @Date: 2018/9/26 11:01
 * @Description:
 */
public class ParallelTest {
    public static void main( String[] args ) {
        long[] arrayOfLong = new long [ 5000 ];

        Arrays.parallelSetAll( arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt( 500000 ) );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();

        Arrays.parallelSort( arrayOfLong );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();
    }
}
