package Excise01;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/24 19:10
 * @Version 1.0
 */
public class Vaild {
    public static boolean valid(String word, String abbr) {
        int length = word.length();
        int sum = 0,c=0;
        int a = 0;
        boolean bool = false;
        for (int i = 0; i < abbr.length(); i++) {
            if (abbr.charAt(i) >= '0' && abbr.charAt(i) <= '9') {
                c = c * 10 + abbr.charAt(i) - 48;
                a++;
            }
            sum+=c;
            c=0;

        }
        sum =sum+abbr.length()-a;
        if (sum == length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "word";
        String abbr = "4";
        System.out.println(Vaild.valid(s, abbr));
    }
}
