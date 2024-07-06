package com.xipeng.mytests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

public class Test4 {
    public static void main(String[] args) {
        // 定义一个Map，key表示省份，value表示市

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市");

        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "武汉市", "孝感市");

        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "石家庄市，张家口市");

        map.put("江苏省", city1);
        map.put("湖北省", city2);
        map.put("河北省", city3);

        for (String key : map.keySet()) {
            StringJoiner sj = new StringJoiner(", ");
            for (String city : map.get(key)) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
