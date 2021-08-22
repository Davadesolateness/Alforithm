package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/23 7:48
 * @Version 1.0
 */
public class L028 {

    public int strStr(String haystack, String needle) {
        if(needle==null || needle.equals("")){
            return 0;
        }
        int l = needle.length(), n = haystack.length();

        for (int start = 0; start < n - l; start++) {
            if (haystack.substring(start, start + l).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String h="";
        String n="";
    }
}
