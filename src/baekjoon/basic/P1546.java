package baekjoon.basic;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        String scores = scanner.next();
        String[] strArr = new String[amount];

        int[] scoreArr = new int[amount];
        int sum = 0;

        for(int i=0; i<amount; i++) {
            strArr[i] = Arrays.toString(scores.split(" "));
        }

        for(int i=0; i<amount; i++) {
            scoreArr[i] = Integer.parseInt(Arrays.toString(scores.split(" ")));
            sum += scoreArr[i];
        }

        double avgScores = sum/amount;

        System.out.println(avgScores);
    }
}
