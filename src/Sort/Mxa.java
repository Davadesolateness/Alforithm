package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 12:18
 * @Version 1.0
 */
public class Mxa {
    public static void main(String[] args) {
        String s = "We provide high-quality medical " +
                "institutions with integrated information solutions " +
                "including HIS, EMR, HRP, CRM, focusing on the core needs of the two industries: " +
                "improving medical quality and enhancing medical trust";
        char [] a = s.toCharArray();
        int[] array = new int[256];
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            array[ch]++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println("输出的字符：" + (char)j+"数量："+array[j]);
        }

    }
}
