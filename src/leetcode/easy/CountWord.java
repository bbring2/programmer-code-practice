package leetcode.easy;

public class CountWord {

    public static int prefixCount(String[] words, String pref) {
        int result = 0;

        for(int i=0; i< words.length; i++) {
            if(words[i].startsWith(pref)) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }

}
