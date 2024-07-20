package com.xipeng.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo11 {
    public static void main(String[] args) {
        // 1. 过滤奇数，留下整数
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> res = list1.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. 姓名，年龄
        // 保留年龄大于等于24岁的人，并将结果收集到Map中，key为姓名，value为年龄
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "zhangsan, 23", "lisi, 24", "wangwu, 25", "zhaoliu, 26");

        Map<String, Integer> map = list2.stream()
                .filter(s -> Integer.parseInt(s.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(", ")[0],
                        s -> Integer.parseInt(s.split(", ")[1])
                ));
        System.out.println(map);

        // 3. 自定义对象
        // 两个集合
        // 1: 6个男演员的名字和年龄
        // 2: 6个女演员的名字和年龄
        // 张三,23
        // 完成以下操作:
        //  1. 男演员只要名字为3个字的前两人
        //  2. 女演员只要姓杨的，并且不要第一个
        //  3. 把过滤后的男演员姓名和女演员姓名合并
        //  4. 将所有演员封装成Actor对象
        //  5. 保存到List集合中
        ArrayList<String> maleActors = new ArrayList<>();
        Collections.addAll(maleActors, "蔡徐坤,29", "张艺兴,30", "宋小宝,50", "艾尔海森,19", "迪卢克,18", "行秋,20");
        ArrayList<String> femaleActors = new ArrayList<>();
        Collections.addAll(femaleActors, "杨一,18", "杨二,19", "杨三,20", "甘雨,3000", "刻晴,18", "芙宁娜,500");

        List<String> actors = new ArrayList<>();
        Stream<String> stream1 = maleActors.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> stream2 = femaleActors.stream()
                .filter(s -> Objects.equals(s.split(",")[0].substring(0, 1), "杨"))
                .skip(1);
//        List<Actor> actorList = new ArrayList<>();
//        for (String s : actors) {
//            Actor actor = new Actor();
//            String name = s.split(",")[0];
//            String age = s.split(",")[1];
//            actor.setName(name);
//            actor.setAge(Integer.parseInt(age));
//            actorList.add(actor);
//        }
//        System.out.println(actorList);
        Stream.concat(stream1, stream2).map(s -> {
            String name = s.split(",")[0];
            int age = Integer.parseInt(s.split(",")[1]);
            return new Actor(name, age);
        }).forEach(System.out::println);
    }
}
