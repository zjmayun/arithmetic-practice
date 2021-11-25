package com.jackey.arithmetic.eleven;

import java.util.Arrays;

/**
 * 11-25
 * 每日练习
 * lettcode-1
 */
public class One {

    public int[] twoSum(int[] nums, int target) {
        int index[] = new int[2];
        // 定义一个标志，退出双重循环
        label:
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    break label;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        One one = new One();
        System.out.println(Arrays.toString(one.twoSum(new int[]{3, 2, 4, 3}, 6)));
    }
}
