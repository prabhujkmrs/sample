package com.leet.problems;

public class PairOfSongs {

    public int numPairsDivisibleBy60(int[] time) {
        /*
        // Brute force solution O(n^2)
        int count=0;
        for(int l=0; l < time.length; l++){
            for(int r = time.length -1; r > l ; r--){
                if((time[l] + time[r]) % 60 == 0 ){
                    count++;
                }
            }
        }

        return count;

        */

        // Optimal solution O(n)
        // Dont understand this solution
       int count = 0;
       int[] remToCount = new int[60];
       for(int i=0; i < time.length; i++){
           int x = time[i];
           int rem = x % 60;
           if(rem == 0)
               count+= remToCount[0];
           else
               count += remToCount[60-rem];
           remToCount[rem]++;
       }
       return count;
    }

    public static void main(String[] args){
        System.out.println(new PairOfSongs().numPairsDivisibleBy60(new int[]{30,20,150,100,40}));
        //System.out.println(new PairOfSongs().numPairsDivisibleBy60(new int[]{60,60,60,60}));
    }
}
