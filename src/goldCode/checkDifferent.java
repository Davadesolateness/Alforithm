package goldCode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/18 16:27
 * @Version 1.0
 */
public class checkDifferent {
    public boolean checkDifferent(String iniString) {
        char st = iniString.charAt(0);
        for (int i = 0; i < iniString.length() - 1; i++) {
            for (int j = i + 1; j < iniString.length() - 1; j++) {
                if (st == iniString.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    //反转字符串
    public String reverseString(String str) {
        StringBuffer str1 = new StringBuffer(str);
        return str1.reverse().toString();
    }

    //比较两个字符串重排之后是否相同
    public boolean checkSam(String str1, String str2) {
        if (str1 == str2) {
            return true;
        }
        if (str1 == null || str2 == null) {
            return false;
        }

        int len;
        if ((len = str1.length()) != str2.length()) {
            return false;
        }

        int[] flags = new int[256];
        for (int i = 0; i < len; i++) {
            flags[str1.charAt(i)]++;
            flags[str2.charAt(i)]--;
        }

        for (int flag : flags) {
            if (flag != 0) {
                return false;
            }
        }
        return true;
    }

    //请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
    //
    //给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
    public String replaceSpace(String str, int length) {
        return str;
    }

    public String zipString(String str) {
        if (str.length() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int a = 0, b = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                b++;
            } else {
                sb.append(str.charAt(i));
                sb.append(String.valueOf(b));
                b = 1;
            }

        }
        sb.append(str.charAt(9));
        sb.append(b);
        if (sb.length() < str.length()) {
            return String.valueOf(sb);
        } else {
            return str;
        }
    }

    //像素反转
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[n - 1 - i][j];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        return mat;
    }

    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1.length() != s2.length()){
            return false;
        }
        int len=s1.length();
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) != s2.charAt(len-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkDifferent a = new checkDifferent();
        String c = "aabcccccdddddddd";
        String b = a.zipString(c);
        System.out.println(b);
    }
}
