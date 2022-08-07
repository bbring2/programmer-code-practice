package leetcode.easy;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = {};

        for(int i=0; i< nums.length; i++) {
            for(int j=1; j< nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer = new int[]{i, j};
                    Arrays.sort(answer);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 9)));
    }
}
