package com.xipeng.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Zhang San", 23);
        Student s2 = new Student("Li Si", 24);
        Student s3 = new Student("Wang Wu", 25);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        // list里存的是Student对象的地址值

        System.out.println(list);
    }
}
