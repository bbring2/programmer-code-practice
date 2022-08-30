package doitBook.array;

public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {
        int i=0;

        a[n] = key; //검색할 값 key를 보초로 a[n]에 대입

        while (a[i] != key) {
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        int[] a = {9, 3, 15, 7, 22, 11, 94, 55, 6};
        int key = 11;

        System.out.println(seqSearchSen(a, a.length-1, key));
    }

}
