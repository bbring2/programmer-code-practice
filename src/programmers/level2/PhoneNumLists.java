package programmers.level2;

import java.util.Arrays;

public class PhoneNumLists {
    public static boolean parserInt(String[] phone_book) {
        boolean answer = true;

        int[] tmp = new int[phone_book.length];

        for(int i=0; i<phone_book.length; i++) {
            tmp[i] = Integer.parseInt(phone_book[i]);
        }
        Arrays.sort(tmp);

        String[] tmp2 = new String[tmp.length];

        for(int i=0; i< tmp.length; i++) {
            tmp2 = Arrays.toString(tmp).split("[\\[\\]]")[1].split(", ");
        }

        String finalTmp = tmp2[0];
        answer = Arrays.stream(tmp2)
                .anyMatch(factor -> factor.contains(finalTmp));

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"2111", "919", "21", "2134"};
        System.out.println(parserInt(phone_book));
    }
}
