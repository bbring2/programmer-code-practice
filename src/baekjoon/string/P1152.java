package baekjoon.string;

import java.util.Scanner;

public class P1152 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);

        String[] strArr = str.split(" ");

        System.out.println(strArr.length);
    }
}
