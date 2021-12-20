package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Minimum {
    public static int[] removeMin(int[] arr) {
        int[] nonAnswer = {-1};
        /*
        * int 순수 배열 arrayList로 선언 후 최소값 찾아서 제거
        * 제거 한 arrayList를 int 순수 배열로 다시 변환
        * */
        ArrayList<Integer> answerList = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());

        answerList.remove(Collections.min(answerList));

        int[] answer = new int[answerList.size()];

        if(answerList.size() <= 1) {
            return nonAnswer;
        } else
            for(int i=0; i< answer.length; i++) {
                answer[i] = answerList.get(i);
            }
            return answer;
    }

    public static void main(String[] args) {
        int[] nonAnswer = {20};
        int[] answer = {4,72,1,56};

        System.out.println(Arrays.toString(removeMin(answer)));
        System.out.println(Arrays.toString(removeMin(nonAnswer)));
    }
}
