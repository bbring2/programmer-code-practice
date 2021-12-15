package programmers.level1;

public class CheckString {
    public static boolean checker(String s) {
        boolean answer = true;

        String regNum4Digits = "[0-9]{4}";
        String regNum6Digits = "[0-9]{6}";

        if(s.matches(regNum4Digits) || s.matches(regNum6Digits)) {
            return answer;
        } else
            return !answer;
    }

    public static void main(String[] args) {
        System.out.println(checker("12345"));
    }
}
