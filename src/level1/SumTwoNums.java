package level1;

public class SumTwoNums {
    public static long solution(int a, int b) {
        long answer = 0;

        if(a>b) {
            for(int i=b; i<a+1; i++) {
                answer += i;
            }
        } else if(a<b) {
            for (int i=a; i<b+1; i++) {
                answer += i;
            }
        } else
            return a;

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(65,1));
    }
}
