package com.xipeng.myimmutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        // 不可变list

        // 一旦创建，不可修改，只能查询
        List<String> list = List.of("张三", "李四");

        // 查询
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        for (String str : list) {
            System.out.println(str);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 都会报错
//        list.remove(0);
//        list.add("aaa");
//        list.set(0, "aaa");
    }

}
