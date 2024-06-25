package com.xipeng.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        // map第二种遍历
        Map<String, String> map = new HashMap<>();

        map.put("老婆1", "甘雨");
        map.put("老婆2", "芙芙");
        map.put("老婆3", "神子");

        // 通过键值对对象进行遍历
        // 返回一个set
//        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
