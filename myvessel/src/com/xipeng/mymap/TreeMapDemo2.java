package com.xipeng.mymap;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 26);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        tm.put(s1, "天津");
        tm.put(s2, "北京");
        tm.put(s3, "上海");

        System.out.println(tm);
    }
}
