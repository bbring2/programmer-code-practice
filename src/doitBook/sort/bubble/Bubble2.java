package doitBook.sort.bubble;

import java.util.Scanner;

//swap할 필요가 없는 경우에는 패스를 포함하는 알고리즘
public class Bubble2 {

    static void bubbleSort(int[] a, int n) {
        for(int i=0; i<n-1; i++) {
            int exchange = 0; //패스하는 교환 회수를 기록

            for(int j=n-1; j>i; i--) {
                swap(a, j-1, j);
                exchange++;
            }

            if(exchange == 0)
                break;;
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        int numInArr = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = numInArr;
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
