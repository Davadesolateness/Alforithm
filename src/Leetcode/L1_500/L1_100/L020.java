package Leetcode.L1_500.L1_100;

import java.util.Stack;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/26 8:37
 * @Version 1.0
 */
public class L020 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');//如果是左括号就进栈右括号
            }else if(c == '['){
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            }else  if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([][][]()(){}{}{}[][[[]()]])";
        L020 a = new L020();
        System.out.println(a.isValid(s));
    }
}
