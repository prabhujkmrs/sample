package com.jpmc.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Given a set of time intervals in any order, merge all overlapping intervals into one and
 * output the result which should have only mutually exclusive intervals. Let the intervals
 * be represented as pairs of integers for simplicity.
 * For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8}}.
 * The intervals {1,3} and {2,4} overlap with each other, so they should be merged and become {1, 4}.
 * Similarly, {5, 7} and {6, 8} should be merged and become {5, 8}
 */

public class MergedIntervals {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervalArray = {
                {1,5},{6,10},{4,7},{1,3},{2,6},{8,10},{15,18}
        };
        int[][] result = new MergedIntervals().merge(intervalArray);
    }
}
