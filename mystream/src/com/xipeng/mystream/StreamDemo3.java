package com.xipeng.mystream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        // 双列集合获取Stream流
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // 获取Stream流
        // 1
        map.keySet().stream().forEach(s -> System.out.println(s));

        // 2
        map.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
