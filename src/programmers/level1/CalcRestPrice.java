package programmers.level1;

/*
* 원래 이용료 : price원
* 놀이기구를 N번째 이용하면 N * price로 받음(첫번째가 100원이었다면 두번째는 200원 이런식)
* 놀이기구를 count번 타게되면 현재 자신이 갖고 있는 금액에서 얼마나 모자란지 return하기 > 금액 안부족한경우 0
* 놀이기구 이용료 price : 1=<price=<2500
* 처음 갖고 있던 금액 money : 1=<money=<1000000000
* 놀이기구 이용횟수 count : 1=<count=<2500
*
* ex) price : 3, money : 20, count : 4, result : 10
*
* */
public class CalcRestPrice {
    public static long solution(int price, int money, int count) {
        //자연수의 합 이용할 것
        long totSum = (long) (price) * (count) * (count+1) / 2;

        if(totSum < money) {
            return 0;
        } else if(totSum == money)  {
            return 0;
        } else
            return totSum - money;
    }
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
