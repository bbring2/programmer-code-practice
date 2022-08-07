package doitBook.basic;

import java.util.Scanner;

/**
 * 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력
 * */

public class Median {

    public static int median31(int num1, int num2, int num3) {
        if(num1 >= num2)
            if(num2 >= num3) {
                return num2;
            } else return Math.min(num1, num3);
        else if (num1 > num3) {
            return num1;
        } else return Math.min(num2, num3);
    }

    public static int median3(int num1, int num2, int num3) {
        if(num1 >= num2)
            if(num2 >= num3) {
                return num2;
            } else if (num1 <= num3) {
                return num1;
            } else
                return num3;
        else if (num1 > num3) {
            return num1;
        } else if ( num2 > num3) {
            return num3;
        } else
            return num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("num2 : ");
        int num2 = scanner.nextInt();
        System.out.println("num3 : ");
        int num3 = scanner.nextInt();

        System.out.println("세 숫자의 중앙값은 " + median3(num1, num2, num3) + " 입니다.");
        System.out.println("세 숫자의 중앙값은 " + median31(num1, num2, num3) + " 입니다.");
    }
}
