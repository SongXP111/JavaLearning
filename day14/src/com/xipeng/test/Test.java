package com.xipeng.test;

import com.xipeng.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);

        System.out.println(s.getName() + " " + s.getAge());

        String str = "abc";
        System.out.println(str);

        com.xipeng.domain1.Teacher t1 = new com.xipeng.domain1.Teacher();
        com.xipeng.domain2.Teacher t2 = new com.xipeng.domain2.Teacher();
    }
}
