package com.xipeng.myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        // 引用静态方法
        // 格式：类名：：静态方法

        // 集合当中有一些String数字，把他们变成int
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9");

        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
