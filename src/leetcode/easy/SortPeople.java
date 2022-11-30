package leetcode.easy;

import java.util.*;

public class SortPeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];

        HashMap<Integer, String> nameAndHeight = new HashMap<>();
        for(int i=0; i< names.length; i++) {
            nameAndHeight.put(heights[i], names[i]);
        }

        List<Integer> tmpHeight = new ArrayList<>(nameAndHeight.keySet());

        tmpHeight.sort(Collections.reverseOrder());

        int resultArrLength = 0;

        for(int j : tmpHeight) {
            result[resultArrLength] = nameAndHeight.get(j);
            resultArrLength++;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

}
