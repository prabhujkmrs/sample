package com.leet.problems;

import java.util.Arrays;

/***
 * Find the missing number in an array of n
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int result =0;
        Arrays.sort(nums);
        int i= nums.length -1;
        if(nums[i] != nums.length){
            return nums.length;
        }
        while(i > 0){
            if(nums[i] - nums[i-1] != 1)
                result = nums[i] -1;
            i--;
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println(new MissingNumber().missingNumber(new int[]{0, 1}));
    }
}
