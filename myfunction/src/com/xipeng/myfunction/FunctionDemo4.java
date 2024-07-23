package com.xipeng.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        // 引用构造方法
        // 格式：类名：：new
        // 需求：集合里面储存姓名和年龄，要求封装成Student对象并收集到List集合中

        // 方法引用
        // 1. 引用处需要是函数式接口
        // 2. 被引用的方法需要已经存在
        // 3. 被引用的方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        // 4. 功能满足当前要求

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "胡桃,16", "雷电将军,7000", "娜维娅,25", "甘雨,3000", "刻晴,18", "芙宁娜,500");

        // String -> Student: map
        List<Student> students1 = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(students1);

        // 形参只有一个String，所以需要新添加一个构造方法
        List<Student> students2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students2);
    }
}
