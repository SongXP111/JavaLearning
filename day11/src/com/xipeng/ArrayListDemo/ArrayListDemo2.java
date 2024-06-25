package com.xipeng.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 1. 创建
        ArrayList<String> list = new ArrayList<>();

        // 2，添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // 3. 删除
//        boolean result = list.remove("aaa");
//        String str = list.remove(0);

        // 4, 修改
//        String result = list.set(0, "eee");
//        System.out.println(result);

        // 5. 查询
//        String result = list.get(0);
//        System.out.println(result);

        // 6. 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
