package level1;

/*
* ex에 p와 y의 개수가 같거나 아예 없는 경우 true
* 둘의 갯수가 같지 않으면 false
* */

import java.util.Arrays;

public class CountPY {
    public static boolean solution(String ex) {
        String[] exArr = ex.split("");

        int countY = Arrays.toString(exArr).compareToIgnoreCase("y");
        int countP = Arrays.toString(exArr).compareToIgnoreCase("p");

        return countP == countY;
    }

    public static void main(String[] args) {
        System.out.println(solution("pyYYYthon"));
    }
}
