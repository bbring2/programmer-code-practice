package doitBook.array;

import java.util.Scanner;

/*
* 구성 요소의 자료형이 int형인 배열
* */
public class MaxOfArray {

    public static int maxOf(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
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