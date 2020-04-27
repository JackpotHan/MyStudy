package com.jackpot.Java8;

import com.sun.tools.javac.util.List;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Jackpot
 * @Date: 2020/4/27 4:00 下午
 * @Description:
 * @Version: 1.0
 */
public class MapTest {


    public static void main(String[] args) {
        Map map = new HashMap();
        List words = List.of("far", "for", "foor", "for", "far", "foor", "far");

        words.forEach(word ->
                map.merge(word, 1, (prev, one) -> Integer.valueOf(prev.toString()) + Integer.valueOf(one.toString()))
        );
        System.out.println(map);
    }
}
