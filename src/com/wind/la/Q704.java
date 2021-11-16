package com.wind.la;

/**
 * https://leetcode-cn.com/problems/binary-search/
 *
 * @author wind
 */
public class Q704 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 9, 7};
        int index = search(nums, 3);
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
