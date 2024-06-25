package com.xipeng.search;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int target = 82;
        System.out.println(basicSearch(arr, target));
    }

    // 参数：
    // 数组，查找的元素
    public static boolean basicSearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}
