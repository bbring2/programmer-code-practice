package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class SortAsc {
    public static String sortAsc(String s) {
        String answer = "";
        String[] tmpArr = s.split("");

        Arrays.sort(tmpArr, Collections.reverseOrder());

        answer = String.join("", tmpArr);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println((sortAsc("assdfZjkasd")));
    }
}
