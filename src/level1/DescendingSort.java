package level1;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort  {
    //1. 정수 n을 입력받는다
    public static long solution (long n) {
        long answer = 0;
        //2. String 변환
        String tmp = Long.toString(n);
        //3. 배열로 쪼개서
        String[] tmpSplit = tmp.split("");
        //4. 내림차순으로 정렬 후
        Arrays.sort(tmpSplit, Collections.reverseOrder());
        //5. 정수로 바꾸기
        String result = String.join("", tmpSplit);

        answer = Long.parseLong(result);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(145907));
    }
}
