package com.xipeng.mymap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        // 和TreeSet底层原理一样，都是红黑树
        // 不重复，无索引，可排序
        // 按key排序

        // Integer Double 默认升序排序
        // String 按照字母升序排序
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);

        tm.put(3, "c");
        tm.put(4, "d");
        tm.put(5, "e");
        tm.put(1, "a");
        tm.put(2, "b");

        System.out.println(tm);
    }
}
