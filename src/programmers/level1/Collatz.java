package programmers.level1;

public class Collatz {
    public static int guessCollatz(int num) {
        int answer = 0;

        while(num==1) {
            if(num%2==0) {
                num /= 2;
                answer++;
            } else {
                num = (3 * num) + 1;
                answer++;
            }

            answer++;

            if(answer==500) {
                return -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(guessCollatz(12));
    }
}
