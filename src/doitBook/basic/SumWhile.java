package doitBook.basic;

import java.util.Scanner;

/*
* 1부터 n까지 합을 구하는 알고리즘
* */
public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지 합을 구합니다.");
        System.out.println("n의 값 :");

        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i<=n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
    }
}
