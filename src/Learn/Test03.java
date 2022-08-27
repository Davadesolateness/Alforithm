package Learn;

import java.util.Scanner;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Test03.java
 * @Description TODO
 * @createTime 2021年08月22日 15:02:00
 */
public class Test03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strTemp = in.nextLine();
        char[] chars = strTemp.toCharArray();
        char[] charsTemp = new char[chars.length + 1];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*') {
                charsTemp[count++] = '*';
            }
        }
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] != '*' && count <= chars.length) {
                charsTemp[count++] = chars[j];
            }
        }
        for (int k = 0; k < charsTemp.length - 1; k++) {
            System.out.print(charsTemp[k]);
        }
    }
}
