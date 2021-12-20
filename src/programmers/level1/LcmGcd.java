package programmers.level1;

import java.util.Arrays;

/*
* 두수를 입력받아서 최대 공약수와 최소 공배수 반환하기
* 배열 앞에는 GCD 뒤에는 LCM
* */
public class LcmGcd {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = getGCD(Math.max(n,m), Math.min(n,m));
        int lcm = getLCM(n, m, gcd);

        answer = new int[]{gcd, lcm};

        return answer;
    }

    public static int getGCD(int n, int m) {
        while (m>0) {
            int tmp = n;
            n = m;
            m = tmp%m;
        }

        return n;
    }

    public static int getLCM(int n, int m, int gcd) {
        return (n*m)/gcd;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 6)));
    }
}
