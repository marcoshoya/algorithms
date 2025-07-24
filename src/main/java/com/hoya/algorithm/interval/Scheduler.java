package com.hoya.algorithm.interval;

import java.util.Arrays;
import java.util.Comparator;

public class Scheduler {

    public static int maxMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 0, end = 0;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                count++;
                end = interval[1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(maxMeetings(meetings)); // Output: 2
    }

}
