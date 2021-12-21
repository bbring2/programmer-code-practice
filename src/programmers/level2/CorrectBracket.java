package programmers.level2;

import java.util.Stack;

public class CorrectBracket {
    public static boolean checkBrackets(String s) {
        int startCnt = 0;
        int endCnt = 0;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            stack.push(s.charAt(i));

            if(s.charAt(i) == '(') {
                startCnt++;
            } else
                endCnt++;
        }

        if(stack.size()%2 != 0) {
            return false;
        } else if(s.charAt(0) == ')') {
            return false;
        } else if(stack.indexOf(stack.size()-1) == '(') {
            return false;
        } else if(startCnt != endCnt) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "()()()";
        int startCnt = 0;
        int endCnt = 0;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            stack.push(s.charAt(i));

            if(s.charAt(i) == '(') {
                startCnt++;
            } else
                endCnt++;
        }


        System.out.println("stack size :: " + stack.size());
        System.out.println("How many ( in this stack :: " + startCnt);
        System.out.println("How many ) in this stack :: " + endCnt);
        System.out.println("stack :: " + stack);

        System.out.println();
        System.out.println(checkBrackets(")()("));

    }
}
