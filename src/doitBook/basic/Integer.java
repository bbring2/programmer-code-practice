package doitBook.basic;

import java.util.Scanner;

/*
* 입력한 정숫값이 양수인지 음수인지 0인지 판단하는 분기
* */
public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println("이 수는 양수입니다.");
        } else if (num < 0) {
            System.out.println("이 수는 음수입니다.");
        } else {
            System.out.println("이 수는 0 입니다.");
        }
    }
}
