package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 14:23
 * @Version 1.0
 */
//对于此题，不能用大数类型，
public class L043 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int l1 = num1.length(), l2 = num2.length(), l = l1 + l2;
        char[] ans = new char[l];
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();

        for (int i = l1 - 1; i >= 0; --i) {
            int c = c1[i] - '0';
            for (int j = l2 - 1; j >= 0; --j) {
                int cc = c2[j] - '0';
                ans[i + j + 1] += c * cc;
            }
        }
        for (int i = l - 1; i > 0; --i) {
            if (ans[i] > 9) {
                ans[i - 1] += ans[i] / 10;
                ans[i] %=10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; ; ++i) {
            if (ans[i] != 0) {
                break;
            }
        }
        for (; i < ans.length; ++i) {
            sb.append((char) (ans[i] + '0'));
        }
        return sb.toString();
    }
}
