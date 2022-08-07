package coding;

import java.util.Arrays;
import java.util.Collections;

public class Sixshop {

    public static int solution(int[] estimates, int k) {
        int minSum = 0;
        int answer = 0;

        for(int i : estimates) {
            minSum = Math.max(minSum, k);
            answer += k;
        }

        int lo = minSum, hi = answer;

        while (lo<=hi)  {
            int mid = (lo + (hi-lo)) / 2;

            if(canSplit(mid, estimates, k)) {
                hi = mid - 1;
            } else
                lo = mid + 1;
        }

        return lo;
    }

    public static boolean canSplit(int targetSum, int[] nums, int m) {
        int count = 1, sum = 0;

        for (int num : nums) {
            sum += num;

            if (sum > targetSum) {
                count++;
                sum = num;  // first element of next subarray

                if (count > m) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int ex[]= {10, 1, 10, 1, 1, 4, 3, 10};
        System.out.println(solution(ex, 3));
    }

}
