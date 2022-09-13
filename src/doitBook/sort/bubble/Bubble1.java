package doitBook.sort.bubble;

import java.util.Scanner;

public class Bubble1 {

    static void swap(int[] a, int idx1, int idx2) {
        int numInArr = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = numInArr;
    }

    static void bubbleSort(int[] a, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(a[j-1] > a[j]) {
                    swap(a, j-1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bubble sort ver1");
        System.out.println("factors: ");

        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++) {
            System.out.println("x[" + i + "]");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬 하였습니다.");

        for(int i=0; i<nx; i++) {
            System.out.println("x[" + i + "]" + x[i]);
        }
    }
}
