package programmers.level2;

/*
* 정수를 이어 붙여 만들 수 있는 가장 큰 수
* */

import java.util.Arrays;
import java.util.Collections;

public class BiggestNum {
    public static String solution(int[] numbers) {
        String tmp = Arrays.toString(numbers).replace(", ","").replace("[","").replace("]","");
        String[] tmpArr = tmp.split("");

        Arrays.sort(tmpArr);
        Collections.reverse(Arrays.asList(tmpArr));

        String answer = Arrays.toString(tmpArr).replace(", ", "").replace("[", "").replace("]", "");

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,99};
        System.out.println(solution(arr));
    }
}
