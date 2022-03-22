package com.leet.problems;

/**
 * Given an array of integers greater than zero, find if it is possible to split it in two subarrays (without reordering the elements),
 * such that the sum of the two subarrays is the same. Print the two subarrays.
 *
 * Examples :
 * Input : Arr[] = { 1 , 2 , 3 , 4 , 5 , 5  }
 * Output :  { 1 2 3 4 }
 *           { 5 , 5 }
 *
 * Input : Arr[] = { 4, 1, 2, 3 }
 * Output : {4 1}
 *          {2 3}
 *
 * Input : Arr[] = { 4, 3, 2, 1}
 * Output : Not Possible
 */

public class SplitToTwoSubArrays {

    private int splitPoint(int[] in){
        int leftSum = 0;

        for(int i=0; i < in.length;i++){
            leftSum += in[i];

            int rightSum = 0;
            for(int j=i+1; j<in.length;j++){
                rightSum += in[j];
            }
            if(leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }

    private void printSubArrays(int[] input) {

        if(splitPoint(input) == -1) {
            System.out.println("Not posible");
            return;
        }

        for(int i = 0; i < input.length; i++){
            if(splitPoint(input) == i){
                System.out.print(input[i]);
                System.out.println();
            } else {
                System.out.print(input[i]);
            }
        }
    }

    public static void main(String [] args){
        new SplitToTwoSubArrays().printSubArrays(new int[]{3,4,5,2});
    }


}
