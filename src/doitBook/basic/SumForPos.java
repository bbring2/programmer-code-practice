package doitBook.basic;

import java.util.Scanner;

/*
* 1부터 n까지 합을구한다. 하지만
* */
public class SumForPos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지 합을 구합니다.");

        do { //n이 0보다 클때까지 반복
            System.out.println("n의 값 :");
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = 0;

        for(int i=0; i<=n; i++) {
            sum += i;
        }

        System.out.println("1부터 "+ n+"까지의 합은 "+sum+"입니다.");
    }
}
