package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplication {
    public static int[] removeDuplicationValue(int[] arr) {

        ArrayList<Integer> answerList = new ArrayList<>();

        for(int checkDup : arr) {
            if(!answerList.contains(checkDup)) {
                answerList.add(checkDup);
            }
        }

        int[] tmpAnswer = new int[answerList.size()];

        for(int i=0; i<tmpAnswer.length; i++) {
            tmpAnswer[i] = answerList.get(i);
        }

        return tmpAnswer;
    }

    public static void main(String[] args) {
        int[] ex = {4,4,4,6,5,2};

        System.out.println(Arrays.toString(removeDuplicationValue(ex)));
    }
}
