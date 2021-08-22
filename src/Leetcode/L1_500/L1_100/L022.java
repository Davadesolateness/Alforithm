package Leetcode.L1_500.L1_100;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 14:09
 * @Version 1.0
 */
public class L022 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n){
        dfs(n,n,"");
        return res;
    }

    private void dfs(int left, int right, String curStr) {
        if (left == 0 && right == 0){ //左右括号都不剩余，递归终止
            res.add(curStr);
            return;
        }

        if (left>0){ //如果左括号还有剩余的话，可以拼接左括号
            dfs(left - 1,right,curStr+"(");
        }
        if (right>left){ //如果右括号比左括号多的话，可以拼接左括号
            dfs(left,right-1,curStr+")");
        }
    }

}
