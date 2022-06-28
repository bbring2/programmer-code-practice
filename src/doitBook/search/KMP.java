package doitBook.search;

import java.util.Scanner;

public class KMP {

    static int kmpMatch(String text, String pattern) {
        int pt = 1;
        int pp = 0;
        int[] skip = new int[pattern.length() + 1]; //건너뛰기 표

        skip[pt] = 0;
        while(pt != pattern.length()) {
            if(pattern.charAt(pt) == pattern.charAt(pp))
                skip[++pt] = ++pp;
            else if (pp == 0) {
                skip[++pt] = pp;
            }
            else
                skip[pp] = pp;
        }

        pt = pp = 0;
        while(pt != text.length() && pp != pattern.length()) {
            if(text.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0) {
                pt++;
            } else
                pp = skip[pp];
        }

        if(pp == pattern.length()) {
            return pt - pp; // 검색 성공
        }

        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        System.out.println("텍스트 : " + text);

        String pattern = scanner.next();
        System.out.println("패턴 : " + pattern);

        int result = kmpMatch(text, pattern);

        System.out.println(result+1+"번째부터 문자열 일치");
    }
}
