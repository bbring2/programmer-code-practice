package baekjoon.condition;

import java.util.Scanner;

public class P1330 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");

        String left = arr[0];
        String right = arr[1];

        if(Integer.parseInt(left) > Integer.parseInt(right)) {
            System.out.println(">");
        } else if (Integer.parseInt(left) < Integer.parseInt(right)) {
            System.out.println("<");
        } else
            System.out.println("==");

    }
}
