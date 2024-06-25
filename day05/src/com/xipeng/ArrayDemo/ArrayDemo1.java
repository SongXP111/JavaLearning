package com.xipeng.ArrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 静态初始化

        // 定义5个学生的年龄
        int[] arr1 = new int[]{11, 12, 13, 14, 15};
        int[] arr2 = {11, 12, 13, 14, 15};

        // 定义3个学生的姓名
        String[] arr3 = new String[]{"Xipeng", "Mino", "Song"};
        String[] arr4 = {"Xipeng", "Mino", "Song"};

        // 定义4个学生的身高
        double[] arr5 = new double[]{1.93, 1.75, 1.87, 1.62};
        double[] arr6 = {1.93, 1.75, 1.87, 1.62};

        System.out.println(arr6); // 地址值


    }
}
