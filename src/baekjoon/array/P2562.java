package baekjoon.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2562 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> originArr = new ArrayList<>();
        List<Integer> sortArr = new ArrayList<>();

        for(int i=0; i<9; i++) {
            originArr.add(i, scanner.nextInt());
            sortArr.add(i, scanner.nextInt());
        }

        scanner.close();

        Collections.sort(sortArr);

        int max = sortArr.get(8);

        for(int j=0; j<9; j++) {
            if(originArr.get(j) == max) {
                System.out.println(max);
                System.out.println(j);
            }
        }
    }
}
