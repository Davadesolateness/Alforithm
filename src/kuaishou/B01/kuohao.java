package kuaishou.B01;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import javax.security.auth.SubjectDomainCombiner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 16:02
 * @Version 1.0
 */
public class kuohao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int right = 0;
        int left = 0;
        int count = 0;
        int right2=0;
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                list.add('(');
            } else if (c == ')') {
                if (list.size()!=0){
                    list.remove(list.size()-1);
                    count++;
                }else {
                    right++;
                }

            }
        }
        System.out.print(count+" ");
        System.out.print(list.size() + " ");
        System.out.print(right + " ");
    }
}
