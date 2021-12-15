package programmers.level1;

public class SquareRoot {
    public static long squareRoot(long n) {
        long answer = 0;

        for(long i=n; i>0; i--) {
            long tmp = n%i;
            if(tmp == 0) {
                return i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(121));
    }
}
