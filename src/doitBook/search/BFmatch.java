package doitBook.search;

import java.util.Scanner;

public class BFmatch {

    static int bfMatch(String txt, String pat) {
        int pt = 0; // pt -> txt 커서
        int pp = 0; // pp -> pat 커서

        while(pt != txt.length() && pp != pat.length()) {
            if(txt.charAt(pt)==pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt-pp+1;
                pp = 0;
            }
        }

        if(pp == pat.length()) { //검색 성공 case
            return pt - pp;
        }

        return -1; //검색 실패 case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next();
        String pat = scanner.next();

        System.out.println("txt : " + txt);
        System.out.println("pat : " + pat);

        int idx = bfMatch(txt, pat);

        if(idx == -1)
            System.out.println("해당 텍스트에 해당하는 패턴이 없습니다.");

        else {
            int len = 0;
            for(int i=0; i<idx; i++) {
                len += txt.substring(i, i+1).getBytes().length;
            }
            len += pat.length();

            System.out.println(idx+1 + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + txt);
            System.out.println("패턴 : " + pat);
        }
    }
}
