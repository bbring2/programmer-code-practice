package programmers.level1;

import java.util.Arrays;

public class MatrixSum {
    public int[][] sum2DMatrix(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        int[][] ex1 = {{1,2}, {2,3}};
        int[][] ex2 = {{-1,-2}, {7,-10}};
        int[][] answer = {};

        for(int i=0; i< ex1.length; i++) {
            for(int j=0; j <ex2.length; j++) {
                answer = new int[][]{{ex1[i][i] + ex2[j][j]}, {ex1[i][i] + ex2[j][j]}};
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}
