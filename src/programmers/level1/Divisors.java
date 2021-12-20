package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisors {
    public static int[] findDivisors(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) answerList.add(arr[i]);
        }

        if(answerList.isEmpty()) {
            answerList.add(-1);
        }

        answer = new int[answerList.size()];

        for(int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {5,9,7,10};
        System.out.println(Arrays.toString(findDivisors(answer, 5)));
    }
}
