package com.xipeng.myset;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan", 23, 90, 99, 50);
        Student2 s2 = new Student2("lisi", 24, 90, 98, 50);
        Student2 s3 = new Student2("wangwu", 25, 95, 100, 30);
        Student2 s4 = new Student2("zhaoliu", 26, 60, 99, 70);
        Student2 s5 = new Student2("qianqi", 26, 70, 80, 70);

        TreeSet<Student2> treeSet = new TreeSet<Student2>();

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student2 student2 : treeSet) {
            System.out.println(student2);
        }
    }
}
