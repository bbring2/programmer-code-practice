package baekjoon.math;

import java.util.Scanner;

public class P1978 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt(); //개수
        int sum = 0; //소수 카운트

        for(int i=0; i<amount; i++) {
            int k = scanner.nextInt();
            boolean isPrime = true;

            if(k==1)
                continue;
            for(int j=2; j<Math.sqrt(k); j++)
                if(k%j == 0) {
                    isPrime = false;
                }

            if(isPrime) {
                sum++;
            }
        }

        System.out.println(sum);

    }
}
