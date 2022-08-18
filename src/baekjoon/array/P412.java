package baekjoon.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P412 {
    public static List<String> fizzBuzz(int n) {

        List<Integer> intList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            intList.add(i, i+1);
        }

        List<String> strList = new ArrayList<>(intList.size());
        for(int j=0; j<intList.size(); j++) {
            strList.add(String.valueOf(intList.get(j)));

            if(Integer.parseInt(strList.get(j))%15 == 0) {
                strList.set(j, "FizzBuzz");
            } else if (Integer.parseInt(strList.get(j))%5 == 0) {
                strList.set(j, "Buzz");
            } else if (Integer.parseInt(strList.get(j))%3 == 0 ) {
                strList.set(j, "Fizz");
            }
        }

        return strList;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
