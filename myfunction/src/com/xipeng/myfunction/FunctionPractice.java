package com.xipeng.myfunction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionPractice {
    public static void main(String[] args) {
        // 方法引用练习

        // 1. 集合中储存一些字符串，比如：张三，23
        // 收集到Student类型的数组中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "胡桃,16", "雷电将军,7000", "娜维娅,25", "甘雨,3000", "刻晴,18", "芙宁娜,500");

        Student[] res1 = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(res1));

        // 2. 创建集合添加学生对象，只获取姓名并放到数组当中
        ArrayList<Student> students = new ArrayList<>();
        list.forEach(s -> students.add(new Student(s)));
        String[] res2 = students.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(res2));

        // 3. 学生对象的集合，把姓名和年龄拼接成：张三-23的字符串，并放到数组中
        String[] res3 = students.stream().map(Student::concat).toArray(String[]::new);
        System.out.println(Arrays.toString(res3));
    }
}
