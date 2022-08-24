package hackkerank.monthKit;

import java.util.*;

public class LonelyInteger {

    //한번만 되어있는것

    public static int lonelyinteger(List<Integer> a) {
        int frequencyTimes = 0;

        for(int i=0; i<a.size(); i++) {
            if(Collections.frequency(a, a.get(i)) < 1) {
                frequencyTimes++;
            }
        }

        return frequencyTimes;
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
