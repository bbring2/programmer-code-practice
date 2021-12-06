package programmers.level1;

import java.util.Arrays;

/*
* 물품을 구매해줄 때에는 각 부서가 신청한 금액만큼 모두 지원
* 해당 금액만큼 딱 맞춰서 해줘야하고 그 이상 절대 ㄴㄴ
* 신청한금액의 배열인 d와 예산 budget을 넣어서 최대 몇개 부서에 지원이 가능한지 return. (값 : 몇개부서)
* invoice: 부서별 신청한 금액 (길이는 1-100) 신청금액은 1이상 100,000이하
* 예산은 10,000,000 이하
* ex) invoice [1,3,4,5,] budget 9 > answer : 3
* */
public class Budget {
    public static int solution(int[] invoice, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(invoice); //차례로 뽑는다

        for(int i=0; i<invoice.length; i++) {
            sum += invoice[i];
            //배열 요소 합을 구해서 budget보다 크면
            if(sum > budget) {
                answer = i;
                //배열 요소 합 구해서 budget보다 작으면 > invoice 크기 뱉어내기
            } else
                answer = invoice.length;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,67,78};
        System.out.println(solution(b, 75));
    }
}
