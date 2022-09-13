package doitBook.sort.straight;

public class InsertionSort {
    static void insertSort(int[] a, int n) {
        for(int i=1; i<n; i++) {
            int j;
            int tmp = a[i];

            for(j=1; j>0 && a[j-1] > tmp; j--) {
                a[j] = a[i-j];
            }

            a[j] = tmp;
        }
    }
}
