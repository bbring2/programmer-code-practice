package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceDifference {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer input = br.read();

        System.out.println();
    }

    public static int sideSum(Integer[] nums) {
        List<Integer> list = Arrays.asList(nums);
        List<Integer> sums = new ArrayList<>();

        for(int i=0; i<list.size()-1; i++) {
            sums.add(list.get(i) + list.get(i+1));
        }

        sums.sort(Collections.reverseOrder());

        return sums.get(0);
    }
}
