package com.xipeng.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 集合长度可变，数组长度固定
        // 集合只能存储引用数据类型，数组可以存储引用和基础数据类型
        // 如果集合需要储存基本数据类型，需要先转化为包装类

        // 创建
        // 泛型：限定集合中储存数据的类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
