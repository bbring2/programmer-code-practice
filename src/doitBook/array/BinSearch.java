package doitBook.array;

//이진 검색 시간 복잡도

public class BinSearch {

    static int binSearch(int[] a, int n, int key) {
        int pl = 0; //검색 범위 첫 인덱스
        int pr = n-1; //검색 범위 끝 인덱스

        do {
            int pc = (pl + pr) / 2; //중앙 요소 인덱스

            if(a[pc] == key)
                return pc; //!! 검색 성공 !!

            else if (a[pc] < key) {
                pl = pc + 1; //검색 범위를 뒤쪽 절반으로 좁힌다.
            }

            else {
                pr = pc -1; //검색 범위를 앞쪽 반으로 좁힌다.
            }
        } while (pl <= pr);

        return -1; //검색 실패
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 11, 7, 6, 18, 31, 4, 21};

        System.out.println(binSearch(a, a.length-1, 31));
    }
}
