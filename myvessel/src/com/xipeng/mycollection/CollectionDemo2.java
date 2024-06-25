package com.xipeng.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 1. 创建集合
        Collection<Student> collection = new ArrayList<>();

        // 2. 创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        // 3. 添加
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);

        // 4. 判断是否包含
        Student s4 = new Student("zhangsan", 23);
        System.out.println(collection.contains(s4)); // false，没有重写equals，用的地址值。重写里之后true
    }
}
