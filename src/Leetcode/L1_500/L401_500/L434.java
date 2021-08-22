package Leetcode.L1_500.L401_500;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/26 9:21
 * @Version 1.0
 */
public class L434 {
    public int countSegments(String s) {
        int count=0;
        int sum = 0;
        for (char ch : s.toCharArray()){
            if ( (ch >= 'A'  && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                sum++;
            }else {
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        L434 a = new L434();
        String s = "heelo,wo a dog a dog";
        System.out.println(a.countSegments(s));
    }
}
