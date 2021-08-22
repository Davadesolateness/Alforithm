package Leetcode.L1_500.L401_500;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 15:34
 * @Version 1.0
 */
public class L486 {
    public String validIPAddress(String IP) {
        if (IP.matches("(((25[0-5])|(2[0-4]\\d)|((1\\d{2})|([1-9]?\\d)))\\.){3}((25[0-5])|(2[0-4]\\d)|((1\\d{2})|([1-9]?\\d)))")){
            return "IPv4";
        }
        if (IP.matches("((\\d|[a-f]|[A-F]){1,4}:){7}((\\d|[a-f]|[A-F]){1,4})")){
            return "IPv6";
        }
        return "Neither";
    }
}
