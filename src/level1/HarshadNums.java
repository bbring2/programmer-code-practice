package level1;

public  class HarshadNums {
    public static boolean solution(int x) {
        //각 자릿수를 더한값으로 x가 나누어 떨어지면 true 아니면 false
        boolean answer = true;
        //마지막 자리수
        int a = x % 10;
        int b = x / 10;
        String toB = Integer.toString(b);
        String[] toBArry = toB.split("");

        int[] finalArr = new int[toBArry.length];
        int sum = 0;

        for(int i=0; i<finalArr.length; i++) {
            finalArr[i] = Integer.parseInt(toBArry[i]);

            sum += finalArr[i];
        }

        if(x % (a+sum) == 0) {
            return answer;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(1234));
    }
}
