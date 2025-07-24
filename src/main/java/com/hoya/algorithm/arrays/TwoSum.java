package com.hoya.algorithm.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {

    /**
     * Solution
     *
     * @param nums int[] nums = new int[]{2, 7, 9, 15};
     * @param target int target = 9
     * @return int[]
     */
    public static int[] getSum(int[] nums, int target) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int n = 0; n < nums.length; n++) {
            int n2 = target - nums[n] ;

            Optional<Integer> hasElement = list.stream()
                    .filter(i -> i == n2)
                    .findAny();

            if (hasElement.isPresent() && list.indexOf(n2) != n) {
                return new int[] {n, list.indexOf(n2)};
            }

        }

        return new int[] {};
    }
}
