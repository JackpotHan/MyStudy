package com.jackpot.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: hanjt
 * @Date: 2018/9/26 14:57
 * @Description:
 */
public class LambdaTest {

    public static void main(String[] args) {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->str.toString().length() > 4);

        System.out.println("Print language which starts with J: ");
        filter(languages,(str)->str.toString().startsWith("J"));

        System.out.println("Print language which ends with a:");
        filter(languages, (str)->str.toString().endsWith("a"));

        System.out.println("Print all language:");
        filter(languages,(str)->true);

        System.out.println("Print No language:");
        filter(languages,(str)->false);

        System.out.println("print language whose length less than 5:");
        filter(languages,(str)->str.toString().length() < 5);
    }

    public static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach(System.out::println);
    }
}
