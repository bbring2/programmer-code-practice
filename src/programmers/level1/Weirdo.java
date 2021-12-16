package programmers.level1;

import java.util.Locale;

public class Weirdo {
    public static String makeUpper(String s) {
        //toUpperCase 사용 -> string 위치 찾기
        int tmpIndex = s.indexOf(s);

        if(tmpIndex % 2 == 0) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(makeUpper("ssdfe wejkrhjkds"));
    }
}
