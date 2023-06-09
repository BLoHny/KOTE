package Java.programmers.Level1_test;

import java.util.*;

class Solution {
    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 3};

        int a = solution(nums);
        System.out.println(a);
    }

    public static int solution(int[] nums) {

        int maxCount = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), maxCount);
    }
}
