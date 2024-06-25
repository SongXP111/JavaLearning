package com.xipeng.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        // map第三种遍历
        Map<String, String> map = new HashMap<>();

        map.put("老婆1", "甘雨");
        map.put("老婆2", "芙芙");
        map.put("老婆3", "神子");
        map.put("老婆4", "影宝");

        // lambda
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
