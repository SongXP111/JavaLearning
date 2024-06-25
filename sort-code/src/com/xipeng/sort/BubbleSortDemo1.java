package com.xipeng.sort;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        // 冒泡排序
        // 1. 相邻的元素两两比较，大的放右边，小的放左边
        // 2. 第一轮比较完毕之后，最大值已经确定，第二轮可以少比较一次，以此类推
        // 3. 如果数组中有n个数据，我们只要执行n-1轮即可
        int[] arr = new int[]{2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
