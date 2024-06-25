package com.xipeng.mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        // 泛型接口
        // 1. 实现类明确类型
        // 2. 实现类延续泛型，创建实现类对象时再确定类型
        MyArrayList2 list = new MyArrayList2();
        list.add("a");

        MyArrayList3<String> list1 = new MyArrayList3<>();
        list1.add("b");
        list1.add("c");
        System.out.println(list1);
    }
}
