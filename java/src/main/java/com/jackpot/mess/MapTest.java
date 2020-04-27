package main.java.jackpot.mess;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: Hanjt
 * @Date: 2018/7/18 16:53
 * @Description:
 */
public class MapTest {

    public static void main(String[] args) {
//        Map<String ,Object> map = new HashMap<>();
//        map.put("name","hanjt");
////        map.keySet().add("sex");
////        map.entrySet().add()
//        System.out.println(map.values());
//        System.out.println(map.keySet().iterator().next());
//        System.out.println(map.entrySet().iterator().next().getValue());
//        System.out.println(map.toString());

        Map<String,String> keySetMap = new HashMap<>();

        Map<String,String> entrySetMap = new HashMap<>();

        for (int i = 0; i < 1000000; i++) {
            keySetMap.put("" + i, "keySet");
        }
        for (int j = 0; j < 1000000; j++) {
            entrySetMap.put("" + j, "entrySet");
        }

        Long startTime1 = System.currentTimeMillis();
//        System.out.println("startTime1："+startTime1);
        Iterator<String> keySetIterator = keySetMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            String value = keySetMap.get(key);
            System.out.println(value);
        }
        Long keySetTime = System.currentTimeMillis() - startTime1;
        long startTime2 = System.currentTimeMillis();
        Iterator<Map.Entry<String, String>> entryKeyIterator = entrySetMap
                .entrySet().iterator();
        while (entryKeyIterator.hasNext()) {
            Map.Entry<String, String> e = entryKeyIterator.next();
            System.out.println(e.getValue());
        }
        Long entryTime = System.currentTimeMillis() - startTime2;

        System.out.println("keySetSpentTime:" + keySetTime);
        System.out.println("enrtySetSpentTime:" + entryTime);

    }
}
