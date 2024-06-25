package com.xipeng.mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        // List删除
        // 1. 直接删除元素
        // 2. 索引

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 索引
        // 在调用方法的时候，如果有重载，方法会优先调用实参和形参一致的方法
        list.remove(1);

        // 手动装箱
        Integer i = Integer.valueOf(1);
        list.remove(i);

        System.out.println(list);
    }
}
