package com.hoya.algorithm.arrays;

import java.util.*;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                duplicates.add(i);
            } else {
                set.add(i);
            }
        }

        Optional<Integer> response = set.stream()
                .filter(i -> !duplicates.contains(i))
                .findAny();

        return response.get();
    }
}
