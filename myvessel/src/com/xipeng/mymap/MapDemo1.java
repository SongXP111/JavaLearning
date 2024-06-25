package com.xipeng.mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        // 1. 创建map
        Map<String, String> map = new HashMap<>();

        // 2. 添加
        // put方法细节：
        // 添加/覆盖
        // 如果key不存在，直接添加，返回null
        // 如果key存在，会覆盖原来的值，并返回被覆盖的值
        map.put("郭靖", "黄蓉");
        map.put("A", "黄蓉");

        // 3. 删除
        // 返回value
        map.remove("郭靖");

        // 4. 清空
//        map.clear();

        // 5. 判断包含key或value
        boolean res1 = map.containsKey("郭靖");
        boolean res2 = map.containsValue("黄蓉");
//        System.out.println(res1);
//        System.out.println(res2);

        // 6. 长度
        System.out.println(map.size());

        // 打印
        System.out.println(map);
    }
}
