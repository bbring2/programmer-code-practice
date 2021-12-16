package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

//제곱근일 경우 (n+1)^2 리턴 아닐 경우 -1 리턴

public class SquareRoot {

    public static long findDivisors(long num) {
        long answer = 0;

        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i=1; i<=num; i++) {
            if(num%i == 0) {
                divisors.add(i);
            }
        }
        //{1,11,121}
        int tmp = divisors.size();
        //11 위치
        int finalTmp = (tmp-1)/2;
        //11값 index로얻어오기
        int squareRoot = divisors.get(finalTmp);

        if(num%squareRoot == squareRoot) {
            answer = (long) (squareRoot+1) *(squareRoot+1);
            return answer;
        } else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(findDivisors(121));
    }
}
