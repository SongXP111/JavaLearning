package com.xipeng.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        // 1. 创建set
        Set<String> s = new HashSet<String>();

        // 2. 添加元素
        s.add("张三");
        s.add("李四");
        s.add("王五");

        // 3. 打印
        System.out.println(s);

        // 4. 遍历
        // 迭代器遍历
//        Iterator<String> iterator = s.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        // 增强for
//        for (String next : s) {
//            System.out.println(next);
//        }

        // lambda
        s.forEach(str -> System.out.println(str));

        // HashSet底层原理
        // 底层采用哈希表储存数据（数组+链表+红黑树）
        // 哈希值：对象的整数表现形式
        // int index = （数组长度 - 1）& 哈希值
        // 根据hashCode方法算出来的整数，默认使用地址值进行计算，一般会重写用对象内部的属性值计算

        // JDK8以前
        // 1. 创建一个默认长度16，默认加载因为0.75的数组，数组名table
        // 2. 根据元素的哈希值跟数组长度计算出应存入的位置
        // int index = （数组长度 - 1）& 哈希值
        // 3. 判断位置是否为null，如果是null直接存入
        // 4. 如果位置不为null，表示有元素，则调用equals方法比较属性值
        // 5. 一样：不存， 不一样：存入数组，形成链表
        // JDK8以前：新元素存入数组，老元素挂在新元素下面（链表）
        // JDK8以后：新元素直接挂在老元素下面（链表+红黑树）
        // 链表长度超过8，且数组长度大于等于64，自动转为红黑树
        // 如果集合中是自定义对象，必须重写hashCode和equals方法
    }
}
