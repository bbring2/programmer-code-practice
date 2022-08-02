package baekjoon.array;

import java.util.Scanner;

public class P11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountOfNum = sc.nextInt();
        String num = sc.next();
        char[] charArr = num.toCharArray();
        int sum = 0;

        for (char c : charArr) {
            sum += c - '0'; //int 변환
        }

        System.out.println(sum);
    }
}
