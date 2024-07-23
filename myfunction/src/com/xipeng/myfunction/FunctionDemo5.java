package com.xipeng.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        // 引用成员方法
        // 格式：类名：：成员方法
        // 需求：集合里的字符串，变成大写后输出

        // 方法引用的规则：
        // 1. 需要有函数式接口
        // 2. 被引用的方法已经存在
        // 3. 被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
        //    第一个形参表示方法的调用者，如果没有第二个参数，说明被引用的方法需要是无参的成员方法
        // 4. 被引用方法的功能需要满足当前需求

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc");

        // String -> String
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        // String里的toUpperCase
        // 拿着流里面的每一个数据，去调用String类中的toUpperCase方法，方法的返回值就是转换之后的结果
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
