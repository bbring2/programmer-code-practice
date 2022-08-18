package hackkerank.easy.string;

import java.util.Scanner;

public class StdinAdnStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String intStr = scanner.nextLine();
        String doubleStr = scanner.nextLine();
        String str = scanner.nextLine();

        int i = Integer.parseInt(intStr);
        double d = Double.parseDouble(doubleStr);

        System.out.println("String: " + str);

        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
