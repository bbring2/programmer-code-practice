package doitBook.basic;

import java.util.Scanner;

/*
* 왼쪽 아래가 직각ㄱ인 이등변 삼각형을 출력
* */

public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.println("몇 단 삼각형인가요? ");
            n = scanner.nextInt();
        } while (n <= 0);

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}