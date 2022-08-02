package coding;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String substring = br.readLine();
        ArrayList<Integer> indexes = strSearch(s1, substring);
        String result = listToString(indexes);

        System.out.println(result);
    }



    public static ArrayList<Integer> strSearch(String fullString, String substring) {

        ArrayList<Integer> indexes = new ArrayList<>();
        if (fullString == null || substring == null)
        {
            indexes.add(-1);
            return indexes;
        }
        int l1 = fullString.length();
        int l2 = substring.length();

        for (int i = 0; i < l1-l2+1; i++) {
            int index = 0;
            int count = 0;
            while (count < l2 && fullString.charAt(i + count) == substring.charAt(count)) {

                count++;

                if (count == l2 && fullString.charAt(i) == substring.charAt(0)) {
                    index = i + 1;
                    indexes.add(index);
                }

            }

        }
        return indexes;
    }

    public static String listToString(ArrayList<Integer> list)
    {
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }
}
