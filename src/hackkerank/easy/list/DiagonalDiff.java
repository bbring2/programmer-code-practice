package hackkerank.easy.list;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int[][] listToarr = arr.stream()
                .map(l -> l.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < listToarr.length; i++) {
            for (int j = 0; j < listToarr.length; j++) {
                if (i == j) {
                    leftSum += listToarr[i][j];
                } else if (i + j == listToarr.length) {
                    rightSum += listToarr[i][j];
                }
            }
        }

        return Math.abs(leftSum - rightSum);
    }

}
