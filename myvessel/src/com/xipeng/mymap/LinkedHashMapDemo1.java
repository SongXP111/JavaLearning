package com.xipeng.mymap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        // 有序，不重复，无索引
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // 按put的顺序排序
        // put第二个a只覆盖值
        linkedHashMap.put("a", 123);
        linkedHashMap.put("b", 456);
        linkedHashMap.put("c", 789);
        linkedHashMap.put("a", 111);



        // 打印
        System.out.println(linkedHashMap); // abc
    }
}
