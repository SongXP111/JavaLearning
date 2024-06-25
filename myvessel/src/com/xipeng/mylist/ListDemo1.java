package com.xipeng.mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<String>();

        // 添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 在指定位置添加
        list.add(1, "QQQ");

        // 删除指定位置元素
        list.remove(1);


        System.out.println(list);
    }
}
