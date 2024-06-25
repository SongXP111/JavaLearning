package com.xipeng.myset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        // 1. 创建TreeSet对象
        TreeSet<Integer> ts = new TreeSet<>();

        // 2. add
        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        // 3. print
//        System.out.println(ts);

        // 4. 遍历
        // 迭代器
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
        }

        // 增强for
        for (int t : ts) {
            System.out.println(t);
        }

        // lambda
        ts.forEach(i -> System.out.println(i));
    }
}
