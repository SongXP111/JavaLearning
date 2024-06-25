package com.xipeng.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 把一位数组中0 - 15 打乱
        // 然后四个一组添加到二维数组中

        // 1. 创造一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 2. 打乱
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 3. 遍历
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }

        // 4. 创造二维数组
        int[][] data = new int[4][4];

        // 5. 添加
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

}
