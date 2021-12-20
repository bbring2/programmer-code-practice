package programmers.level1;

import java.util.Arrays;

public class DotProduct {
    public static int getDotProd(int[] a, int[] b) {
        int tmp = 0;

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
            }

            tmp += a[i]*b[i];
        }

        return tmp;
    }

    public static void main(String[] args) {
        int[] a = {-1,2,4};
        int[] b = {3,-4,3};
        System.out.println(getDotProd(a,b));
    }
}
