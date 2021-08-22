package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 11:21
 * @Version 1.0
 */
public class L005 {
    public static int max = 0;
    public static int s1 = 0;
    public static int e1 = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int strLen = s.length();
        int maxStart = 0; //最长回文子串的起点
        int maxEnd = 0;  //最长回文子串的终点
        int maxLen = 1;  //最长回文子串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;
                    }
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }


}
