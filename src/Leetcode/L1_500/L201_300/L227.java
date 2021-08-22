package Leetcode.L1_500.L201_300;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 18:39
 * @Version 1.0
 */
public class L227 {
    public int calculate(String s) {
        /*char c[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int a, sum = 0;
        for (int i = 0; i < c.length; i++) {
            //如果是乘除，就出栈进行计算
            stack.push(c[i]);
            if (c[i] == '*') {
                a = stack.pop();
                a = a * c[i + 1];
                stack.push((char) a);
            } else if (c[i] == '/') {
                a = stack.pop();
                a = a / c[i + 1];
            }
        }

        char[] c1 = new char[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            c1[i] = stack.pop();
            i++;
        }

        for (int j = 0; j < c1.length; j++) {
            if (c1[i] == '+') {
                sum = sum + c1[i - 1] + c1[i + 1];
            } else if (c1[i] == '-') {
                sum = sum + c1[i - 1] - c1[i + 1];
            }
        }
        return sum;*/

        Stack<Integer> numStack = new Stack<>();
        char lastOp = '+';
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            }
            //如果是数字
            if (Character.isDigit(arr[i])) {
                int tempNum = arr[i] - '0';
                while (++i < arr.length && Character.isDigit(arr[i])) {
                    tempNum = tempNum * 10 + (arr[i] - '0');
                }
                i--;

                if (lastOp == '+') {
                    numStack.push(tempNum);
                } else if (lastOp == '-') {
                    numStack.push(-tempNum);
                } else {
                    numStack.push(res(lastOp, numStack.pop(), tempNum));
                }
            }else {
                lastOp = arr[i];
            }
        }
        int ans = 0;
        for (int num : numStack) {
            ans += num;
        }
        return ans;
    }

    private int res(char op, int a, int b) {
        if (op == '*'){
            return a*b;
        }else if(op == '/'){
            return a/b;
        }else if(op == '+'){
            return a+b;
        }else {
            return a-b;
        }
    }
}
