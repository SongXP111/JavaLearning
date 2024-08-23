package com.xipeng.myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 利用糊涂包hutool生成假数据，并写到文件当中

        // 1. 定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        // 2. 爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        // 3. 利用正则表达式获取数据
//        ArrayList<String> familyNameTempList = getData(familyNameStr, "(.{4})(，|。)", 1);
//        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
//        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);
        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        // 4. 处理数据
        // 把每一个姓氏拆开，并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'e' || c == 'm' || c == '\"' || c == '>') {
                    continue;
                }
                familyNameList.add(c + "");
            }
        }
        System.out.println(familyNameList);

        // 处理男生的名字
        // 去重
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }
        System.out.println(boyNameList);

        // 处理女生的名字
        // 每五个一组，用空格进行切割
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            girlNameList.addAll(Arrays.asList(arr));
        }
        System.out.println(girlNameList);

        // 5. 生成数据
        // 姓名（唯一）-性别-年龄
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        // 6. 写出数据
        FileUtil.writeLines(list, "/Users/xipengsong/IdeaProjects/Java/myiotest/src/com/xipeng/myiotest1/names2.txt", "UTF-8");
    }

    /*
     * 获取男生和女生的信息：张三-男-23
     * 形参：
     * 1. 姓氏
     * 2. 男生名字
     * 3. 女生名字
     * 4. 男生个数
     * 5. 女生个数
     * */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,
                                             ArrayList<String> boyNameList,
                                             ArrayList<String> girlNameList,
                                             int boyCount,
                                             int girlCount) {
        // 1. 生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() >= boyCount) {
                break;
            }
            // 随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }

        // 2. 女生
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() >= girlCount) {
                break;
            }
            // 随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }

        // 3. 性别，年龄
        // 男生年龄随机18-27
        // 男生年龄随机18-25
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String str : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(str + "-男-" + age);
        }
        for (String str : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(str + "-女-" + age);
        }
        return list;
    }
}
