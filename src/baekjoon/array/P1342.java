package baekjoon.array;

public class P1342 {
    public static int numberOfSteps(int num) {
        //num이 짝수이면, 나누기 2 아니면 빼기 1 하기
        int count = 0;
        int tmp = 0;

        do {
            if(num%2==0) {
                tmp = num/2;
                count++;
            } else {
                tmp = num-1;
                count++;
            }
            count++;
        } while (num==0);

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
