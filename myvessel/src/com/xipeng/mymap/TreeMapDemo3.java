package com.xipeng.mymap;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        // 统计字符串中每个字符的数量，并按照格式输出
        printString("aababcabcdabcde");
    }

    public static void printString(String str) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(k).append("(").append(v).append(")").append(" "));
        System.out.println(sb);
    }
}
