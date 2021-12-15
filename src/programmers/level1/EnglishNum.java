package programmers.level1;

public class EnglishNum {
    public static int verNum(String s) {
        int answer = 0;

// 0 zero 1 one 2 two 3 three 4 four 5 five 6 six 7 seven 8 eight 9 nine

        String[] verEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] verNum = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for(int i=0; i< verEng.length; i++) {
            s = s.replace(verEng[i], verNum[i]);
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        String s = "43one5seven9zero123six";
        System.out.println(verNum(s));
    }
}
