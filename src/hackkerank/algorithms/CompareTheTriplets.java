package hackkerank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore = 0;
        int bScore = 0;

        List<Integer> scores = new ArrayList<>();

        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aScore++;
            } else if (a.get(i) < b.get(i)) {
                bScore++;
            }
        }

        scores.add(aScore);
        scores.add(bScore);

        return scores;
    }
}
