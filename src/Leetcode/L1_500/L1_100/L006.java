package Leetcode.L1_500.L1_100;

public class L006 {

    /**
     * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行?Z 字形排列。
     * <p>
     * 比如输入字符串为 "PAYPALISHIRING"?行数为 3 时，排列如下：
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * <p>
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
     * <p>
     * 请你实现这个将字符串进行指定行数变换的函数：
     * <p>
     * string convert(string s, int numRows);
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        char[][] result = new char[numRows][numRows * 2];
        int n = s.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            result[x][y] = s.charAt(i);
            if (y + 1 % numRows != 0) {
                x--;
                y++;
            }
            if (x + 1 == numRows) {
                y++;
            } else {
                x++;
            }
        }
        System.out.println(result);
        return "1";
    }

    public static boolean valueOf(boolean b){
        return (b ? Boolean.TRUE : Boolean.FALSE);
    }
    

}
