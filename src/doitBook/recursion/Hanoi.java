package doitBook.recursion;

import java.util.Scanner;

public class Hanoi {

    static int totalCount = 0;

    //n개의 원반을 x번 기둥에서 y번 기둥으로 옮기기
    static void move(int n, int x, int y) {

        if(n > 1) {
            move(n-1, x, 6-x-y);
            totalCount++;
        }

        System.out.println("원반[" + n + "]을" + x + " 기둥에서 " + y + " 기둥으로 옮김");

        if(n > 1) {
            move(n-1, 6-x-y, y);
            totalCount++;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑 : ");
        System.out.println("원반 개수 : ");

        int n = scanner.nextInt();

        move(n, 1, 3);

        System.out.println("옮긴 총 횟수는 " + totalCount + "번 입니다.");
    }
}
