package doitBook.array;

public class LinearSearch {

    //while문 구현
    static int seqSearch(int[] target, int n, int key) {
        //요소수가 n개인 배열 target에서 key의 요소값을 검색한다.

        int i=0;

        while (true) {
            if(i==n)
                return -1;
            if(target[i] == key)
                return i;
            i++;
        }
    }

    static int seqSearchFor(int[] target, int n, int key) {
        for(int i=0; i<n; i++) {
            if(target[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] target = {1,5,6,4,9,10,2,11,92,16};
        int length = 10;
        int key = 2;

        System.out.println(seqSearch(target, length, key));
        System.out.println(seqSearchFor(target, length, key));
    }

}
