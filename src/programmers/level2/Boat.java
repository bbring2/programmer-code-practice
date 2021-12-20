package programmers.level2;

import java.util.Arrays;
import java.util.Collections;

//구명보트에 100kg이상은 못태움 하지만 최대한 적게 사용해야함
public class Boat {
    public static int resque(int[] people, int limit) {
        int answer = 0;
        int tmp = people.length;
        int totalWeight = 0;

        Arrays.sort(people);

        for(int i=0; i<tmp; i++) {
            totalWeight += people[i] + people[tmp-1];
            if(totalWeight == limit) {
                answer++;
            } else if(totalWeight > limit/2) {
                totalWeight += people[i]+people[tmp-1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] people = {50, 80, 70, 60};
        System.out.println(resque(people, 100));
    }
}
