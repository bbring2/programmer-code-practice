package level1;

import java.util.Arrays;

public class ReverseArr {
    public static int[] solution(long originValue) {
        //long값을 string으로 파싱하기
        String parsedValue = String.valueOf(originValue);

        //받은 값 뒤집기 위해서 reverse() 메소드 쓰기 위해 스트링 버퍼
        StringBuilder sb = new StringBuilder(parsedValue);
        sb = sb.reverse();

        String[] strArr = sb.toString().split(",");

        int[] answer = new int[sb.length()];

        for(int i=0; i<sb.length(); i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1872378234)));
    }
}
