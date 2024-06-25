package com.xipeng.myset;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        // 比较
        // 1. 默认排序/自然排序
        // 2. 比较器


        // 1. 创建学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        // 2. 集合
        TreeSet<Student> treeSet = new TreeSet<Student>();

        // 3. add
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        // 4. print
        System.out.println(treeSet);

    }
}
