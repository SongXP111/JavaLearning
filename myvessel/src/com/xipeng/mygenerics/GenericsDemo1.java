package com.xipeng.mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        // 没有泛型的时候
        // 如果没有指定类型，默认所有都是Object
        // 可以添加所有类型
        // 但是无法使用数据的特有行为

        // 泛型的好处：
        // 1. 统一数据类型
        // 2. 把运行时期的问题提前到里编译期间，避免了强制类型转化可能出现的异常

        // 细节：
        // 1. 不能写基本数据类型
        // 2. 可以传入该类型和子类型
        // 3. 如果不写，默认是Object

        // 1. 创建集合的对象
        ArrayList<String> list = new ArrayList<>();

        // 2. 添加数据
        list.add("aaa");

        // 3. 遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
