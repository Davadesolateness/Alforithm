package kuaishou.A02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 12:30
 * @Version 1.0
 */
public class zuhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] letter_map = {
                " ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        List<String> res = new ArrayList<>();
        res.add("");
        for (int i = 0; i < str.length(); i++) {
            String letters=letter_map[str.charAt(i)-'0'];
            int size = res.size();
            //计算出队列长度后，将队列中的每个元素挨个拿出来
            for(int j=0;j<size;j++) {
                //每次都从队列中拿出第一个元素
                String tmp = res.remove(0);
                //然后跟"def"这样的字符串拼接，并再次放到队列中
                for(int k=0;k<letters.length();k++) {
                    res.add(tmp+letters.charAt(k));
                }
            }
        }
    }
}
