package hackkerank.monthKit;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<arr.size(); i++) {
            for(int j=0; j<arr.size(); j++) {
                if(i==j) {
                    sum1 += arr.get(i).get(j);
                }

                if(i+j == arr.size()-1) {
                    sum2 += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(sum1-sum2);
    }
}
