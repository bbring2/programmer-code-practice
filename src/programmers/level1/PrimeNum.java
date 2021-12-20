package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNum {
    public static int findPrimeNum(int n) {
        int answer = 0;
        int[] tmpArr = {};

        for(int i=2; i<=n; i++) {
            tmpArr[i]=i;

            if(tmpArr[i] == 0)
                continue;

            for(int j=i+i; j<=n; j+=i) {
                tmpArr[j] = 0;
            }
        }

        return tmpArr.length;
    }

    public static void main(String[] args) {
        System.out.println(findPrimeNum(10));
    }
}
