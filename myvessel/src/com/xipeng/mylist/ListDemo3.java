package com.xipeng.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    public static void main(String[] args) {
        // List遍历
        List<String> list = new ArrayList<String>();

        // 添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 1. 迭代器
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // 2. 增强for
//        for (String s : list) {
//            System.out.println(s);
//        }

        // 3. lambda
//        list.forEach((s) -> System.out.println(s));

        // 4. 普通for
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // 5. 列表迭代器
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
