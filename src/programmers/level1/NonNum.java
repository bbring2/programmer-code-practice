package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NonNum {
    public static int addNonNums(int[] numbers) {
        int answer = 0;
        int[] exArr = {0,1,2,3,4,5,6,7,8,9};

        Arrays.sort(numbers);

        ArrayList<Integer> numbersList = (ArrayList<Integer>) Arrays.stream(numbers).boxed().collect(Collectors.toList());
        ArrayList<Integer> exArrList = (ArrayList<Integer>) Arrays.stream(exArr).boxed().collect(Collectors.toList());

        exArrList.removeAll(numbersList);

        for(int i=0; i<exArrList.size(); i++) {
            answer += exArrList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] exArr = {3,4,5,6,7,8,9};
        int tmp = 0;

        ArrayList<Integer> ex1 = new ArrayList<>();

        for(int i=0; i<10; i++) {
            ex1.add(i);
        }

        ArrayList<Integer> ex2 = new ArrayList<>();
        ex2.add(9);
        ex2.add(2);
        ex2.add(8);
        ex2.add(5);
        ex2.add(6);

        ex1.removeAll(ex2);

        for(int i=0; i< ex1.size(); i++) {
            tmp += ex1.get(i);
        }

        System.out.println(ex1);
        System.out.println(tmp);
        System.out.println(addNonNums(exArr));

    }
}
