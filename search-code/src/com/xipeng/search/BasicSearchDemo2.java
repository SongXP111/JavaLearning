package com.xipeng.search;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        // 查找索引
        // 不需要考虑索引
    }

    public static int basicSearch1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> basicSearch2(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
