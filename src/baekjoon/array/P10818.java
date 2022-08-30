package baekjoon.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10818 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        List<Integer> intList = new ArrayList<>();

        for(int i=0; i<amount; i++) {
            intList.add(i, scanner.nextInt());
        }

        Collections.sort(intList);

        System.out.println(intList.get(0) + " " + intList.get(amount-1));
    }
}
