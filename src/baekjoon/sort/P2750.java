package baekjoon.sort;

import java.util.*;

public class P2750 {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ex = new ArrayList<>();
        int n = scanner.nextInt();

        for(int i=0; i<n; i++) {
            ex.add(i, scanner.nextInt());
        }

        Collections.sort(ex);

        for(Integer i : ex) {
            System.out.println(i);
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //정렬할 수 개수
        int[] A = new int[N]; //정렬할 배열 선언하기

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N-1; i++) { // 현재 A 배열의 값 보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
            for(int j=0; j<N-1-i; j++) {
                if(A[j] > A[j+1]) {
                    int tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
    }

}
