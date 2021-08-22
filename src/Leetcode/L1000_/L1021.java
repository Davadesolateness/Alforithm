package Leetcode.L1000_;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 16:56
 * @Version 1.0
 */
public class L1021 {
    public String removeOuterParentheses(String S) {
        StringBuffer sb = new StringBuffer();
        int level =0;
        for(char c : S.toCharArray()){
            if (c==')'){
                level--;
            }
            if (level>=1){
                sb.append(c);
            }
            if (c=='('){
                level++;
            }
        }
        return sb.toString();
    }
}
