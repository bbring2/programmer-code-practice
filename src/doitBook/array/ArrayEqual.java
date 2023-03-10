package doitBook.array;

import java.util.Arrays;
import java.util.Scanner;

/*
* 두 배열이 같은지 확인하는 클래스
* */
public class ArrayEqual {

    public static boolean equals(int[] arrA, int[] arrB) {
        if(arrA.length != arrB.length) {
            return false;
        }

        for(int i=0; i< arrA.length; i++) {
            if(arrA[i] != arrB[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n값 : ");
        int n = scanner.nextInt();

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++) {
            answer[i] = i+1;
        }
        return answer;
    }

}
