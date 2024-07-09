package com.xipeng.mystream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        // 1. 把张开头的储存到新集合中
        // 2. 把张开头，长度为3的储存到新集合中
        // 3. 打印

        //
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("张无忌");
        list1.add("赵四");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.startsWith("张")) {
                list2.add(name);
            }
        }
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if (name.length() == 3) {
                list3.add(name);
            }
        }
        System.out.println(list3);

        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(System.out::println);
    }
}
