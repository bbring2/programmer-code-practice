package baekjoon.functions;

/*
*  A 고정 비용 B 재료비와 인건비
*  노트북 한대 비용은 A+B 10대 생산시 총 10*(A+B)만큼 듬
*  노트북 가격 C원일 때 손익 분기점 : 총 비용 >= 고정 비용A+가변비용B
*  A는 고정 B는 한대 팔때마다 계속 올라감
*  만약 10대를 팔았다면, 10C = A + 10B 인것. 이때, 10C > A + 10B 보다 클 때를 찾아야함
* */
public class BreakEvenPoint {
    public static int findPoint(int fixedFee, int payPerLaptop, int laptopPrice) {
        int times = 0;
        long totalIncome = (times)*laptopPrice;

        if(totalIncome > fixedFee+(times*payPerLaptop)) {
            while (totalIncome >= fixedFee+(times*payPerLaptop))
                totalIncome /= times;
        } else
            return -1;
        return times;
    }

    public static void main(String[] args) {
        System.out.println(findPoint(1000, 70, 170));
    }
}
