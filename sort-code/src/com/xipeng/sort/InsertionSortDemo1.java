package com.xipeng.sort;

public class InsertionSortDemo1 {
    public static void main(String[] args) {
        // 插入排序
        // 将0索引的元素到N索引的元素看作是有序的，把N+1索引的元素到最后一个当成无序的
        // 遍历无序的数据，将遍历的元素插入有序序列适当的位置，如遇到相同数据，插在后面
        // N: 0 - 最大索引

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        // 1. 找到无序开始的索引
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        System.out.println(startIndex);

        // 2. 遍历从startIndex到最后一个元素
        for (int i = startIndex; i < arr.length; i++) {
            // 记录插入数据的索引
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
