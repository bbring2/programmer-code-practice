package doitBook.array;

import java.util.Scanner;

/*
* 난수 사용해서 배열의 요솟값 설정하기
*
* */
public class MaxOfArrayRand {

    public static int maxOf(int[] arr) {
        int max = 0;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = scanner.nextInt();

        int[] heights = new int[num];

        for(int i=0; i<num; i++) {
            System.out.println("키 ["+i+"]");
            heights[i] = scanner.nextInt();
        }

        System.out.println("키의 최대값은 " + maxOf(heights) + "입니다.");
    }

}
