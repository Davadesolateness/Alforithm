package Leetcode.L1_500.L101_200;

import java.util.Stack;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 17:07
 * @Version 1.0
 */
public class L155 {
    private Stack<Integer> stack;
    private int min;

    //初始化栈
    public L155() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);//再每一个min进入的时候，将他之前的那个min入栈
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) {//如果出栈的是当前min，就将它压在它底下的前一个min出栈
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
