package baekjoon.string;

import java.util.Scanner;

public class P11720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();

        String[] strArr = str.split("");
        int[] intArr = new int[size];
        int sum = 0;

        for(int i=0; i<size; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
            sum += intArr[i];
        }

        System.out.println(sum);
    }
}
