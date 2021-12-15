package programmers.level1;

import java.util.Arrays;

/*
* 두수를 입력받아서 최대 공약수와 최소 공배수 반환하기
* 배열 앞에는 GCD 뒤에는 LCM
* */
public class LcmGcd {
    public static int[] solution(int n, int m) {
        int[] answer = {};
        int tmp = m%n;
        int gdb = answer[0];
        int lcm = answer[1];

        if(tmp != 0) {
            gdb = 1;
            lcm = m*n;
        } else
            gdb = m/n; lcm = gdb*(m%n);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 6)));
    }
}
