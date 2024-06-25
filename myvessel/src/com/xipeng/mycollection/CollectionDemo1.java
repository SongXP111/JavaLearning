package com.xipeng.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // Collection接口
        // 实现类：ArrayList

        Collection<String> collection = new ArrayList<>();

        // 1. 添加元素
        // 往list里添加，永远return true，允许重复
        // 往set里加，如果存在则false，不允许重复
        collection.add("a");
        collection.add("b");
        collection.add("c");

        // 2. 清空
//        collection.clear();

        // 3. 删除
        // Collection定义的是共性方法，只能通过元素的对象进行删除
        // 删除成功返回true，失败false
        collection.remove("d");

        // 4. 包含
        // 底层是equals
        // 如果集合中是自定义对象，必须在javabean中重写equals
        // Demo2
        boolean contains = collection.contains("a");
        System.out.println(contains);

        System.out.println(collection);
    }
}
