package baekjoon.condition;

import java.util.Scanner;

public class P2480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        scanner.close();

        if(input1 == input3 && input2 == input3) {
            System.out.println(10000+(input2*1000));
        } else if (input1==input2 || input1==input3 || input2==input3) {
            if(input1==input2) {
                System.out.println(1000+(input2*100));
            } else if (input1==input3) {
                System.out.println(1000+(input1*100));
            } else {
                System.out.println(1000+(input3*100));
            }
        } else {
            if(input1>input2 && input1>input3) {
                System.out.println(input1*100);
            } else if (input2>input1 && input2>input3) {
                System.out.println(input2*100);
            } else {
                System.out.println(input3*100);
            }
        }
    }
}
