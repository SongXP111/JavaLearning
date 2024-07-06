package com.xipeng.mytests;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        // 班里有N个学生
        // 学生属性：姓名，年龄，性别
        // 实现随机点名器
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f");

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
