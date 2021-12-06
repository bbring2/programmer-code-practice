package programmers.level1;

/*
* arr은 0~9로 이루어짐
* 연속적으로 나타나는 숫자는 하나뺴고 다 제거
* 제거된 후에는 그 이후 숫자 순서는 유지
* ex) [1,3,3,0,1,1] -> [1,3,0,1]
* set은 중복을 허락하지 않으므로 array -> set 변환
* */

import java.util.*;

public class NoSameNums {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> tmpList = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(!tmpList.contains(arr[i]))
                tmpList.add(arr[i]);
        }

        Collections.sort(tmpList);

        return answer;
    }
}
