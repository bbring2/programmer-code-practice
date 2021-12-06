package programmers.level1;

/*
1. 정수들의 절대값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 닮은 배열 signs
2. 실제 정수 합 구하기
 */

public class PlusMinus {
    public static int plusminus(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<signs.length; i++) {
            if(signs[i] == true) {
                absolutes[i] = Math.abs(absolutes[i]);
            } else {
                absolutes[i] = (absolutes[i]) * -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 56, 11, 114};
        boolean[] check = {true, true, true, false, true, false};

        System.out.println(plusminus(nums, check));
    }
}
