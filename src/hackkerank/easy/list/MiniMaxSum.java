package hackkerank.easy.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static String miniMaxSum(List<Integer> arr) {

        int minSum = 0;
        int maxSum = 0;

        Collections.sort(arr);

        for(int i=0; i<4; i++) {
            minSum += arr.get(i);
        }

        Collections.sort(arr, Collections.reverseOrder());

        for(int j=0; j<4; j++) {
            maxSum+= arr.get(j);
        }

        String min = String.valueOf(minSum);
        String max = String.valueOf(maxSum);

        return min+" "+max;
    }

    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(123);
        newList.add(23);
        newList.add(11);
        newList.add(91);
        newList.add(711);

        System.out.println(miniMaxSum(newList));
    }
}
