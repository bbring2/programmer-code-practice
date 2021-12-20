package programmers.level1;


public class CenterChar {
    public static String findCenterChar(String s) {
        String[] tmpArr = s.split("");
        int tmpIndex = tmpArr.length;

        //짝수인 경우
        if(tmpArr.length%2 == 0) {
            return tmpArr[(tmpIndex/2)-1]+tmpArr[tmpIndex/2];
        } else
            return tmpArr[(tmpIndex-1)/2];
    }

    public static void main(String[] args) {
        System.out.println(findCenterChar("asdasf"));
    }
}
