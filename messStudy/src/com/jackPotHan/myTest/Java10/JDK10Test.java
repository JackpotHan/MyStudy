package com.jackPotHan.myTest.Java10;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/**
 * @Author: hanjt
 * @Date: 2018/9/27 10:44
 * @Description:
 */
public class JDK10Test {
    public static void main(String[] args) throws MalformedURLException {
        var map = new HashMap();

        var git = new URL("https://github.com/JackpotHan");

        var thought = "Java more and more like as Groovy";

        var notice = "You need Java 10 Environment";

        map.put("name", "JackpotHan");
        map.put("age", 23);
        map.put("sex", "boy");
        map.put("github", git);
        map.put("thought", thought);
        map.put("notice", notice);

        System.out.println("About Me:" + map);
    }
}
