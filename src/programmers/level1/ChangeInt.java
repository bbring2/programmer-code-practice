package programmers.level1;

public class ChangeInt {
    public static int changer(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(changer("-12345"));
    }
}
