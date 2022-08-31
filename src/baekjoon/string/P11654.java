package baekjoon.string;

import java.util.Scanner;

//숫자를 입력하면 문자를 뱉어내는 것
public class P11654 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char ch = (char) num;

        System.out.println(ch);
    }
}
