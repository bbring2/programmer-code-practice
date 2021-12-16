package programmers.level1;

import java.util.Arrays;

public class Kim {
    public static String findKim(String[] seoul) {
        int locationIndex = Arrays.asList(seoul).indexOf("kim");

        return "김서방은 "+locationIndex+"에 있다";
    }

    public static void main(String[] args) {
        String[] seoul = {"dd", "kim", "kimkjhj", "sdfjksd"};

        System.out.println(findKim(seoul));
    }
}
