package leetcode.easy;

import java.util.Arrays;

public class SortArr {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1};

        System.out.println(maxProduct(nums));
    }
}
