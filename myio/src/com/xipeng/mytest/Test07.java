package com.xipeng.mytest;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException {
        // 需求：实现一个验证程序运行次数的小程序
        // 1. 程序前三次运行显示：欢迎使用本软件，第{n}次使用免费
        // 2. 程序运行超过三次时给出提示：本软件只能免费使用三次，欢迎您注册会员后继续使用

        // 1. 把文件中的数字读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("myio/src/com/xipeng/files/test07Count.txt"));
        String line = br.readLine();
        int count = Integer.parseInt(line);
        count++;

        // 2. 判断数字
        // 小于等于3：正常运行
        // 大于3：不能运行
        if (count <= 3) {
            System.out.println("欢迎使用本软件，第" + count + "次使用免费");
        } else {
            System.out.println("本软件只能免费使用三次，欢迎您注册会员后继续使用");
        }

        // 3. 把count写出到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio/src/com/xipeng/files/test07Count.txt"));
        bw.write(count + "");


        // 释放资源
        bw.close();
    }
}
