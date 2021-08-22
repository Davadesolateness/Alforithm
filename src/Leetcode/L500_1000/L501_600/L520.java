package Leetcode.L500_1000.L501_600;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/29 14:30
 * @Version 1.0
 */
public class L520 {
    public boolean detectCapitalUse(String word) {
        if (word == null){
            return false;
        }
        char[] c = word.toCharArray();
        boolean flag = true;
        boolean flag1 =true;
        boolean flag2 = true; //证明后面有没有大写字母
        for (int i = 1; i < c.length; i++) {
            if (c[i] < 'A' || c[i] > 'Z'){
                flag = false;
            }else {
                flag2 = false;
            }
        }
        if ( c[0] < 'A' || c[0] > 'Z'){
            flag1 = false;
        }
        //首字母大写，后面是小写
        if (flag1){
            if(flag || flag2){
                return true;
            }else {
                return false;
            }
        }else {
            if (flag2){ // 后面没有大写字母
                return true;
            }else {
                return false;
            }
        }
    }
}
