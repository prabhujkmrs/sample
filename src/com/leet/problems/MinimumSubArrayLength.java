package com.leet.problems;

public class MinimumSubArrayLength {

    public int minSubArrayLen(int target, int[] nums) {

        int len = Integer.MAX_VALUE;

        for(int i=0; i < nums.length; i++){
            int sum =0;
            int cnt = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                cnt+=1;
                if(sum >= target){
                    len = Math.min(len,cnt);
                    break;
                }
            }
        }
        return len;
    }

    // Sliding window technique
    public int minSubArrayLength(int target, int[] nums) {

        int len = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;

        for(int r=0; r < nums.length; r++){
            sum = sum + nums[r];
           while(sum >= target){
               len = Math.min(len, r-l+1);
               sum = sum - nums[l];
               l++;
           }
        }
        return len;
    }

    public static void main(String[] args){
        //System.out.println(new MinimumSubArrayLength().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(new MinimumSubArrayLength().minSubArrayLength(7, new int[]{2,3,1,2,4,3}));
    }

}
