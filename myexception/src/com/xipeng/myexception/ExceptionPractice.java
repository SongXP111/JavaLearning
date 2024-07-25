package com.xipeng.myexception;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        // 录入心仪的女朋友的姓名和年龄
        // 姓名的长度在3-10之间
        // 年龄的范围为18-40岁
        // 超出这个范围视为异常，不能赋值

        // 1. 键盘录入对象
        Scanner scanner = new Scanner(System.in);

        // 2. 创建女朋友的对象
        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                // 3. 接受姓名
                System.out.println("请输入姓名");
                String name = scanner.nextLine();
                gf.setName(name);

                // 4. 接受年龄
                System.out.println("请输入年龄");
                int age = Integer.parseInt(scanner.nextLine());
                gf.setAge(age);
                break;
            } catch (NumberFormatException | NameFormatException | AgeOutOfBoundException e) {
                e.printStackTrace();
            }
        }

        // 5. 打印
        System.out.println(gf);
    }
}
