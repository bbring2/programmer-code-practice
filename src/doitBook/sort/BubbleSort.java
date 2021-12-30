package doitBook.sort;

import java.util.Scanner;

class BubbleSort {

    //버블 정렬
    static void bubbleSort(int[] a, int n) {
        for(int i=0; i<n-1; i++)
            for(int j=n-1; j>i; j--)
                if(a[j-1] > a[j])
                    swap(a, j-1, j);
    }

    //a[idx1]과 a[idx2]값 바꾸는 메서드
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬 Version.1 :: {}");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++) {
            System.out.println("x["+i+"]");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, nx); // 배열 x를 버블 정렬한다

        System.out.println("DESC Sorting");
        for(int i=0; i<nx; i++)
            System.out.println("x["+i+"] = " + x[i]);
    }
}
