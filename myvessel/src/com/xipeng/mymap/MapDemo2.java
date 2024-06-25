package com.xipeng.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // map的遍历
        Map<String, String> map = new HashMap<>();

        map.put("1", "111");
        map.put("2", "222");
        map.put("3", "333");


        // 获取所有的key
        Set<String> keys = map.keySet();
        for (String key : keys) {
//            System.out.println(key);
            // 用get获取value
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
