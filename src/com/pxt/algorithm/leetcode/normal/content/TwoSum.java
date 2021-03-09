package com.pxt.algorithm.leetcode.normal.content;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode_001
 * 两数之和
 * <p>
 * 给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * @author Peng xue-tao
 * @since 2021/2/2
 */
public class TwoSum {

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] nums = {3,2,4};
//        int target = 6;
        int[] nums = {3,3};
        int target = 6;
//        int[] nums = {2, 3, 6, 7, 1, 8};
//        int target = 15;
        System.out.println(Arrays.toString(twoSum3(nums, target)));
    }

    /**
     * 暴力算法
     *
     * @param nums 输入数组
     * @param target 目标值
     * @return int[] 返回数组
     */
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 两遍哈希表
     *
     * @param nums 输入数组
     * @param target 目标值
     * @return int[] 返回数组
     */
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        return new int[0];
    }

    /**
     * 一遍哈希表
     *
     * @param nums 输入数组
     * @param target 目标值
     * @return int[] 返回数组
     */
    private static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
