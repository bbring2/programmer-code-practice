package programmers.level2;

public class NumOf124 {
    public static String solution(int n) {
        //3의 제곱씩 개수가 증가한다
        //3 나머지 연산을 통해서 자리수 카운트 나누어 떨어질 때 자리수를 고려하여야함)
        StringBuilder answer = new StringBuilder();
        int tmp = n;

        while(tmp > 0) {
            if(tmp % 3 == 0) {
                answer.insert(0, "4");
                tmp --; //나누어 떨어질 경우 자리수를 고려한 부분
            } else if(tmp % 3 == 1) {
                answer.insert(0, "1");
            } else
                answer.insert(0, "2");
        }
        tmp /= 3;

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
