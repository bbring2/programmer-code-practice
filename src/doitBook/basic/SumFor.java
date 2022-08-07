package doitBook.basic;

import java.util.Scanner;

/*
* 1 ~ n까지의 합을 구하지만 for문을 이용한 알고리즘
* */
public class SumFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지 합을 구합니다.");
        System.out.println("n 값: ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i=0; i<=n; i++) {
            sum += i;
        }

        System.out.println("1부터 "+n+"까지의 합은 "+sum+" 입니다.");
    }
}
