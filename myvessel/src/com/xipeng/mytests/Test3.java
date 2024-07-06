package com.xipeng.mytests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 被点到的学生不会再被点到
        // 如果都点完了，重新开启第二轮点名
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "甘雨", "刻晴", "神子", "芙芙", "娜维娅", "影宝", "胡桃");

        // 创建一个集合，用来储存被点到的名字
        ArrayList<String> list2 = new ArrayList<>();

        // 随机抽取并删除
        Random r = new Random();
        while (!list1.isEmpty()) {
            int index = r.nextInt(list1.size());
            String name = list1.remove(index);
            list2.add(name);
            System.out.println(name);
        }

        System.out.println(list1);
        System.out.println(list2);

        // 把名字存到list1
        // 清空list2
        list1.addAll(list2);
        list2.clear();
    }
}
