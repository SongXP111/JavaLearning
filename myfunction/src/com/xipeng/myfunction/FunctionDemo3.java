package com.xipeng.myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        // 引用成员方法
        // 其他类：其他类对象：：方法名
        // 本类：this：：方法名
        // 父类：super：：方法名

        // 需求：
        // 过滤集合中的名字
        // 姓杨，且三个字
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "杨一", "杨二", "杨三", "杨玉环", "甘雨", "刻晴", "芙宁娜");

        list.stream()
                .filter(s -> s.charAt(0) == '杨' && s.length() == 3)
                .forEach(System.out::println);

        list.stream()
                .filter(new StringOperation()::StringJudge)
                .forEach(System.out::println);

    }
}
