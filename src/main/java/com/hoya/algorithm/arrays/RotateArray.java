package com.hoya.algorithm.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void rotate() {

        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;

        // Step 1: Normalize k
        k %= nums.length;

        // Step 2: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 3: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 4: Reverse the remaining elements
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
