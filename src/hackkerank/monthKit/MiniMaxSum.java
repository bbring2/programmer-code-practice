package hackkerank.monthKit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        int minSum = 0;
        int maxSum = 0;

        Collections.sort(arr);

        for(int i=0; i<arr.size()-1; i++) {
            minSum += arr.get(i);
            maxSum += arr.get(i+1);
        }

        System.out.println(minSum + " " + maxSum);

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(9);
        arr.add(1);
        arr.add(8);

        miniMaxSum(arr);
    }
}
