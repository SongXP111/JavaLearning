package com.xipeng.myiotest3;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // 登陆小案例
        // 账号锁定：加入count，连续输入三次错误账号被锁定

        // 1. 读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("myiotest/src/com/xipeng/myiotest3/userinfo.txt"));
        String line = br.readLine();
        br.close();

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");
        String rightUsername = arr1[1];
        String rightPassword = arr2[1];
        int count = Integer.parseInt(arr3[1]);

        System.out.println(rightUsername);
        System.out.println(rightPassword);

        // 2. 用户键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        // 3. 比较
        if (username.equals(rightUsername) && password.equals(rightPassword) && count < 3) {
            System.out.println("登陆成功");
            writeInfo("username=" + username + "&password=" + password + "&count=0");
        } else {
            count++;
            if (count < 3) {
                System.out.println("登陆失败，还剩下" + (3 - count) + "次机会");
            } else {
                System.out.println("用户账号被锁定");
            }
            writeInfo("username=" + username + "&password=" + password + "&count=" + count);
        }
    }

    public static void writeInfo(String s) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/src/com/xipeng/myiotest3/userinfo.txt"));
        bw.write(s);
        bw.newLine();
        bw.close();
    }
}
