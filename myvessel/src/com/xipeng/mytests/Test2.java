package com.xipeng.mytests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        // 班里有N个学生
        // 学生属性：姓名，年龄，性别
        // 实现随机点名器
        // 70%概率男生，30%概率女生

        // 创建集合并打乱
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(list);
        System.out.println(list);

        // 抽取
        // 如果是1，从男生里随机抽
        // 如果是2，从女生里随机抽
        Random r = new Random();
        int index = r.nextInt(list.size());
        int num = list.get(index);
        System.out.println(num);

        // 创建两个集合，储存男生和女生的名字
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();

        // 判断
        if (num == 1) {
            int boyIndex = r.nextInt(boys.size());
            String name = boys.get(boyIndex);
            System.out.println(name);
        } else {
            int girlIndex = r.nextInt(girls.size());
            String name = girls.get(girlIndex);
            System.out.println(name);
        }
    }
}
