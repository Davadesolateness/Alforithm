package goldCode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/18 22:09
 * @Version 1.0
 */
public class stack {
    //两个栈实现队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //让stack1成为入队进入的栈
       stack1.push(node);
    }

    public int pop() {
        //让stack2成为出队的栈
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                int a = stack1.pop();
                stack2.push(a);
            }
        }else {
            return stack2.pop();
        }
        return stack2.pop();
    }

    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < numbers.length; i++) {
            list.add(numbers[numbers.length-i-1]);
        }
        return list;
    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
    }
}
