package com.fangin.leetcode.search;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int midVal = nums[mid];

            if (midVal == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return l;

    }
}
