package com.company.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args) {
        int []arr = {3,2,3,4,6,5};

        System.out.println(findErrorNums(arr));
        
    }
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, n = nums.length;
        long sum = (n * (n+1)) / 2;
        for(int i : nums) {
            if(set.contains(i)) duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[] {duplicate, (int)sum + duplicate};
    }
}
