package com.xipeng.myiotest1;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        * 需求：指造假数据
        * 获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
        * 获取男生名字：http://www.haoming8.cn/baobao/10881.html
        * 获取女生名字：http://www.haoming8.cn/baobao/7641.html
        * */

        // 1. 定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        // 2. 爬取数据，把网站上的所有字符拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

//        System.out.println(familyNameStr);
//        System.out.println(boyNameStr);
//        System.out.println(girlNameStr);

        // 3. 通过正则表达式，把其中符合要求的数据获取出来
        ArrayList<String> familyNameTempList = getData(familyNameStr, "(.{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);

        // 4. 处理数据
        // 把每一个姓氏拆开，并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
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
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/src/com/xipeng/myiotest1/names.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
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

    private static ArrayList<String> getData(String str, String regex, int index) {
        // 1. 创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        // 2. 按照正则表达式获取数据
        Pattern pattern = Pattern.compile(regex);
        // 3. 按照pattern的规则去str中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(index);
            if (group.startsWith("em")) {
                continue;
            }
//            System.out.println(group);
            list.add(group);
        }
        return list;
    }

    /*
    * 从网络上爬取数据，把数据拼接成字符串返回
    * */
    public static String webCrawler(String net) throws IOException {
        // 1. 定义StringBuilder接收数据
        StringBuilder sb = new StringBuilder();
        // 2. 创建一个url对象
        URL url = new URL(net);
        // 3. 链接上这个网址
        URLConnection connection = url.openConnection();
        // 4. 读取数据
        InputStreamReader isr = new InputStreamReader(connection.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        // 5. 释放资源
        isr.close();
        // 6. 返回值
        return sb.toString();
    }
}
