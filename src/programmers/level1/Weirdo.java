package programmers.level1;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Weirdo {
    public static String makeUpper(String s) {

        String[] tmpArr = s.split("");

        for(int i=0; i<tmpArr.length; i++) {
            if(i%2 == 0) { //홀수 일때
                 tmpArr[i] = s.toUpperCase();
            }
        }

        String answer = Arrays.stream(tmpArr).collect(Collectors.joining());

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(makeUpper("sfjsadfasd ddsfhasd"));
    }
}
