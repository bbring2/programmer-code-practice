package baekjoon.basic;

import java.util.Arrays;
import java.util.Scanner;

public class P3003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chess1 = scanner.nextInt();
        int chess2 = scanner.nextInt();
        int chess3 = scanner.nextInt();
        int chess4 = scanner.nextInt();
        int chess5 = scanner.nextInt();
        int chess6 = scanner.nextInt();

        int[] chess = {chess1, chess2, chess3, chess4, chess5, chess6};
        int[] exArr = {1,1,2,2,2,8};
        int[] answer = new int[6];

        for(int i=0; i<chess.length; i++) {
            answer[i] = exArr[i]-chess[i];
        }

        System.out.println(Arrays.toString(answer));
    }

}
