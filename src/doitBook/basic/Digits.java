package doitBook.basic;

import java.util.Scanner;

/*
* 2자리의 양수를 입력해야만 넘어갈 수 있음
* */
public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.println("입력값 : ");
            num = scanner.nextInt();
        } while (num < 10 || num > 99);

        System.out.println("변수 num의 값은 " + num +"이 되었습니다.");
    }
}
