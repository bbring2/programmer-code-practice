package leetcode.easy;

import java.util.Stack;

public class ValidBracket {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char comp = s.charAt(i);

            if(comp == '(' || comp == '{' || comp == '['){
                stack.push(comp);
            }
            else{
                if(stack.size() == 0)
                    return false;
                if(comp == ')' && stack.peek() != '(')
                    return false;
                else if(comp == '}' && stack.peek() != '{')
                    return false;
                else if(comp == ']' && stack.peek() != '[')
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()]{}"));
    }
}
