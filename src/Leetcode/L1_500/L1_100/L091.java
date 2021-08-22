package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 18:01
 * @Version 1.0
 */
public class L091 {
    public int numDecodings(String s) {

        //进行递归，如果第一位是1的话，就到下一位，下两位开始进行递归
        //如果第一位是2的话，判断下一位是不是1-6，是的话就进行下一位和下两位进行递归，不是就下一位递归
        int len = s.length();
        int sum = numCheck(s, 0);
        return sum;
    }

    public int numCheck(String s, int start) {
        if (start == s.length()) {
            return 1;
        }
        //以0位开始的数是不存在的
        if (s.charAt(start) == '0') {
            return 0;
        }
        //递归的递推式应该是如果index的后两位小于等于26，
        // digui(s, start) = digui(s, start+1)+digui(s, start+2)
        // 否则digui(s, start) = digui(s, start+1)
        int ans1 = numCheck(s, start + 1);
        int ans2 = 0;
        if (start < s.length() - 1) {
            int ten = (s.charAt(start) - '0') * 10;
            int one = (s.charAt(start + 1) - '0');
            if (ten + one <= 26) {
                ans2 = numCheck(s, start + 2);
            }
        }
        return ans1 + ans2;


        /*if (s.charAt(start) == '1' && start + 2 < s.length()) {
            return numCheck(s, start + 2, count);
        }else if (s.charAt(start) == '1' && start + 1 < s.length()){
            return numCheck(s, start + 1, count);
        } else if (s.charAt(start) == '2') {
            if (start + 1 < s.length() && s.charAt(start + 1) <= 6) {
                return numCheck(s, start + 2, count);
            } else {
                return numCheck(s, start + 1, count);
            }
        } else if (s.charAt(start) == '2' && start+2<s.length()){
            return numCheck(s,start+1,count);
        }else {
            return numCheck(s, start + 1, count);
        }*/
    }
}
