package com.xipeng.StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type string:");
        String str1 = scanner.next(); // new
        String str2 = "abc";

        System.out.println(str1 == str2); // false
    }
}
