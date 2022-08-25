package hackkerank.monthKit;

import java.util.*;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        int answer = 0;

        for(int i=0; i<a.size(); i++) {
            if(Collections.frequency(a, a.get(i)) == 1) {
                answer = a.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(1);

        System.out.println(lonelyinteger(a));
    }
}
