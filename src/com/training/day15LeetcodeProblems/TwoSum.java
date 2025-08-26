package com.training.day15LeetcodeProblems;

import java.util.Scanner;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        int[] res=twoSum(nums,target);
        if(res.length ==0){
            System.out.println("No values found");
        }
        else{
            System.out.println(res[0]+res[1]);
        }   
        sc.close();
    }
}