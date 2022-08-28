package baekjoon.loop;

import java.util.Scanner;

public class P10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        for(int i=0; i<amount; i++) {
            System.out.println(scanner.nextInt()+ scanner.nextInt());
        }
    }
}
