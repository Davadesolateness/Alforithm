package Learn;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName a.java
 * @Description TODO
 * @createTime 2021年07月11日 20:03:00
 */
public class StringForObject {
    public static void main(String[] args) {
        String str1 = new String("a") + new String("a");
        str1.intern();
        String str4 = "aa";
        System.out.println(str1 == str4);
    }
}
