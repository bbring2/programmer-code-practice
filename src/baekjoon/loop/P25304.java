package baekjoon.loop;

import java.util.Scanner;

public class P25304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAmount = scanner.nextInt();
        int list = scanner.nextInt();

        int calcAmount = 0;

        for(int i=0; i<list; i++) {
            calcAmount += scanner.nextInt() * scanner.nextInt();
        }

        if (calcAmount==totalAmount) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
