package programmers.level2;

import java.util.Arrays;

//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//scoville : 음식의 스코빌 지수를 배열에 넣은 것, k: 우리가 원하는 스코빌 지수 (모든 음식에 들어간 합과 비교될 대상임)
//모든 음식의 스코빌 지수를 K이상으로 만들 수 없는 경우에는 -1을 리턴해야한다.
//ex) [1,2,3,9,10,12] 만들고싶은 스코빌지수K = 7 > 리턴값 :
public class SpicyScore {
    public static int spicy(int[] scoville, int k) {
        //for문을 돌면서 어떤 특정값이 k보다 낮은 값이 있는지?
        int lessValue = 0;

        Arrays.sort(scoville);

        for(int i=0; i<scoville.length; i++) {
            if(scoville[i] < k) {
                lessValue = scoville[i];
            }
        }
        return lessValue;
    }

    public static void main(String[] args) {
        int[] exArr = {1,4,5,6,7,8,11};
        int valueK = 29;

        System.out.println(spicy(exArr, valueK));
    }
}
