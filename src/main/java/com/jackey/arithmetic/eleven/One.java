package com.jackey.arithmetic.eleven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public int[] twoSumSecond(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hash.containsKey(target - nums[i])) {
                return new int[]{hash.get(target - nums[i]), i};
            }
            hash.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
//        One one = new One();
//        System.out.println(Arrays.toString(one.twoSum(new int[]{3, 2, 4, 3}, 6)));

        One one = new One();
        System.out.println(Arrays.toString(one.twoSumSecond(new int[]{3, 2, 4, 3}, 6)));
    }
}
