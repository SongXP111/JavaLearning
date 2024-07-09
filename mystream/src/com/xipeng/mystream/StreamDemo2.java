package com.xipeng.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f");
        // 获取流水线
        Stream<String> stream1 = list.stream();
        // 使用终结方法打印所有数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                // s: 表示流水线上的每个数据
                System.out.println(s);
            }
        });

        list.stream().forEach(s -> System.out.println(s));
    }
}
