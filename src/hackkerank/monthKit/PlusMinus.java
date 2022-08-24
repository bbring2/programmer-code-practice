package hackkerank.monthKit;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        // new arr = {1, 2, 3}
        //new answer = {3/6, 2/6, 1/6}
        double positiveAmount = 0;
        double negativeAmount = 0;
        double zeroAmount = 0;

        for (Integer integer : arr) {
            if (integer == 0) {
                zeroAmount++;
            } else if (integer > 0) {
                positiveAmount++;
            } else {
                negativeAmount++;
            }
        }

        double positiveOne = positiveAmount/arr.size();
        double negativeOne = negativeAmount/arr.size();
        double zeroOne = zeroAmount/arr.size();

        System.out.println(positiveOne);
        System.out.println(negativeOne);
        System.out.println(zeroOne);

        //round up 6
        String positive = String.format("%.6f", positiveOne);
        String negative = String.format("%.6f", negativeOne);
        String zero = String.format("%.6f", zeroOne);

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(-1);
        list.add(-3);
        list.add(0);

        plusMinus(list);
    }

}
