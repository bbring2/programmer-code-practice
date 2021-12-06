package programmers.level1;

public class Watermelon {
    public static String watermelon(int n) {
        String answer = "";
        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(watermelon(7));
    }
}
