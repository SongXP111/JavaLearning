package com.xipeng.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo5 {
    public static void main(String[] args) {
        // for each
        Collection<String> collection = new ArrayList<>();
        collection.add("zhangsan");
        collection.add("lisi");
        collection.add("wangwu");

        // 匿名内部类
        // 底层：
        // 遍历集合，一次得到每一个元素
        // 然后传递给accept方法
//        collection.forEach(new Consumer<String>() {
//            @Override
//            // s表示集合中的每一个数据
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // lambda
        collection.forEach(s -> System.out.println(s));
    }
}
