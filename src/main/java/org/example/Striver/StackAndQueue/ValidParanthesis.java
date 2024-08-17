package org.example.Striver.StackAndQueue;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {

        System.out.println(isValidParanthesis());
    }

    public static boolean isValidParanthesis(){
        String str = "(){[]}";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char ch = stack.peek();
                stack.pop();
                if((str.charAt(i) == '}' && ch == '{') ||
                        (str.charAt(i) == ')' && ch == '(') ||
                        (str.charAt(i) == ']' && ch == '[')){
                     continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
