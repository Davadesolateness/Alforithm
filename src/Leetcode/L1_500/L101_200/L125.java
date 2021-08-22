package Leetcode.L1_500.L101_200;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 9:03
 * @Version 1.0
 */
public class L125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (right >= left){
            //遇到非数字或字母跳过
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            //判断是否相等
            if (right >= left && Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            }else {
                return false;
            }


        }
        return true;
    }

}
