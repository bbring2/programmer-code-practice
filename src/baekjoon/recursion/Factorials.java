package baekjoon.recursion;

public class Factorials {
    public static int factorials(int n) {
        int answer = 1;

        if(n>1) {
            for(int i=1; i<n+1; i++) {
                answer *= i;
            }
            return answer;
        } else
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorials(0));
    }
}
