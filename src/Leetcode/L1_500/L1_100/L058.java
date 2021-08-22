package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/26 9:42
 * @Version 1.0
 */
public class L058 {
    public static int lengthOfLastWord(String s) {
        if (s.length()==0){
            return 0;
        }
        int count=0;
        int len = s.length() - 1;
        while (s.charAt(len)== ' ' && len >0){
            len--;
        }
        for (int i = 0; i  <=len; i++) {
            if (s.charAt(i) == ' '){
                count=0;
            }else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "    ";
        System.out.println(L058.lengthOfLastWord(s));
    }
}
