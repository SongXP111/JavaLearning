package com.xipeng.sort;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        // 快速排序
        // 以0索引的数字为基准数，确定基准数在数组中正确的位置
        // 比基准数小的在左边，大的在右边
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        // 定义两个变量记录查找的范围
        int start = i;
        int end = j;

        // 出口
        if (start > end) {
            return;
        }

        // 基准数
        int baseNumber = arr[i];

        // 利用循环找到要交换的数字
        while (start != end) {
            // 利用end从后往前找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            // 利用start从前往后找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        // 当start和end指向了同一个元素，表示找到了基准数的位置，归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        // 确定6左边的范围，重复
        quickSort(arr, i, start - 1);
        // 右边
        quickSort(arr, start + 1, j);
    }
}
