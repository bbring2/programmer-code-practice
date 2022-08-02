package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DynamicProgramming {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        System.out.println(fastTestMaxSum(nums));
    }

    private static int fastTestMaxSum(int[] arr) {
        int ret = 0;
        int psum = 0;

        for (int j : arr) {
            psum = Math.max(psum, 0) + j;
            ret = Math.max(psum, ret);
        }

        return ret;
    }
}
