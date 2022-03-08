package com.leet.problems;


public class JumpGame {

    /**
     * You are given an integer array nums. You are initially positioned at the array's first index,
     * and each element in the array represents your maximum jump length at that position.
     *
     * Return true if you can reach the last index, or false otherwise.
     */
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length -1;

        for( int i = nums.length -1; i >= 0; i--){
            if(nums[i] + i >= lastIndex)
                lastIndex=i;
        }
        return lastIndex== 0? true: false;
    }

    /***
     * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
     *
     * Each element in the array represents your maximum jump length at that position.
     *
     * Your goal is to reach the last index in the minimum number of jumps.
     *
     * You can assume that you can always reach the last index.
     *
     * Example 1:
     *
     * Input: nums = [2,3,1,1,4]
     * Output: 2
     * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
     * Example 2:
     *
     * Input: nums = [2,3,0,1,4]
     * Output: 2
     * @param nums
     * @return
     */

    public int countJump(int[] nums){
        int res = 0;
        int start=0;
        int end=0;

        while(end < nums.length -1){
            int farthest = 0;
            for(int i = start; i < end+1; i++){
                farthest = Math.max(farthest, i + nums[i]);
            }
            start = end + 1;
            end = farthest;
            res = res + 1;
        }

        return res;
    }

    public static void main(String[] args){
        System.out.println(new JumpGame().canJump(new int[]{3,2,1,0,4}));
       // System.out.println(new JumpGame().canJump(new int[]{2,3,1,0,5}));

        //System.out.println(new JumpGame().countJump(new int[]{2,3,1,1,4}));
        //System.out.println(new JumpGame().countJump(new int[]{3,2,1,1,4}));
        //System.out.println(new JumpGame().canJump(new int[]{2,3,1,0,5}));
    }
}
