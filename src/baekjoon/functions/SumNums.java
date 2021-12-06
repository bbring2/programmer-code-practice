package baekjoon.functions;

/*
* 배열 a는 합을 구해야하는 정수가 다 들어가있음
*  리턴값 result는 배열 a의 정수를 다 더한값
* */
public class SumNums {
    public static int sum(int[] a) {
        int sum = 0;

        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] ex = {11, 131, 1434, 993};

        System.out.println(sum(ex));
    }
}
