package com.xipeng.myset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        // 比较器
        TreeSet<String> ts = new TreeSet<>((String o1, String o2) -> {
                // 按照长度排序
                int i = o1.length() - o2.length();
                // 如果一样则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
