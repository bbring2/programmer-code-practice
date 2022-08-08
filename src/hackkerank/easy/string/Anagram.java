package hackkerank.easy.string;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //input 쓸 단어랑 이 단어가 쓴단어로 만들어지는 단어인지?
        //만들어지면 anagrams, 아니면 Not anagrams

        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.next();
        String secondStr = scanner.next();

        char[] firstStrArr = firstStr.toCharArray();
        char[] secondStrArr = secondStr.toCharArray();

        HashMap<String, Integer> firstMap = new HashMap<>();
        HashMap<String, Integer> secondMap = new HashMap<>();
    }
}
