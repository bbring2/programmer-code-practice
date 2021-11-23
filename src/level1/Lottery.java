package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* 1위 6개 일치 / 2위 5개 일치 / 3위 4개 일치/ 4위 3개 일치 / 5위 2개 일치 / 6 낙첨
*
* */
public class Lottery {
    public static int[] solution(int[] lottos, int[] winNums) {
        //당첨 번호 만들기
        Set<Integer> settedWinNums = new HashSet<>();
        for(int n : winNums) {
            settedWinNums.add(n);
        }

        //당첨번호랑 일ㅊ;
        int winCount = 0;
        //알아보지 못하는 숫자
        int zeroCount = 0;
        for(int n : lottos) {
            if(settedWinNums.contains(n)) {
                winCount++;
            }
            if(n==0) {
                zeroCount++;
            }
        }

        return new int[] {Math.min(7 -(winCount+zeroCount), 6), Math.min(7 - winCount, 6)};
    }

    public static void main(String[] args) {
        int[] boughtLotto = {1, 14, 0, 0, 32, 29};
        int[] lottosNum = {14, 17, 32, 29, 10, 8};

        System.out.println(Arrays.toString(solution(boughtLotto, lottosNum)));
    }

}
