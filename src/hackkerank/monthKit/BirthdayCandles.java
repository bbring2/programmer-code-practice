package hackkerank.monthKit;

import java.util.Collections;
import java.util.List;

public class BirthdayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int answer = 0;

        Collections.sort(candles, Collections.reverseOrder());

        int biggestOne = candles.get(0);

        answer = Collections.frequency(candles, biggestOne);

        return answer;
    }


}
