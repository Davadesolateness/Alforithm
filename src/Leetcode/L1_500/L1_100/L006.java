package Leetcode.L1_500.L1_100;

public class L006 {

    /**
     * ��һ�������ַ��� s ���ݸ��������� numRows ���Դ������¡������ҽ���?Z �������С�
     * <p>
     * ���������ַ���Ϊ "PAYPALISHIRING"?����Ϊ 3 ʱ���������£�
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * <p>
     * ֮����������Ҫ�����������ж�ȡ��������һ���µ��ַ��������磺"PAHNAPLSIIGYIR"��
     * <p>
     * ����ʵ��������ַ�������ָ�������任�ĺ�����
     * <p>
     * string convert(string s, int numRows);
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        char[][] result = new char[numRows][numRows * 2];
        int n = s.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            result[x][y] = s.charAt(i);
            if (y + 1 % numRows != 0) {
                x--;
                y++;
            }
            if (x + 1 == numRows) {
                y++;
            } else {
                x++;
            }
        }
        System.out.println(result);
        return "1";
    }

    public static boolean valueOf(boolean b){
        return (b ? Boolean.TRUE : Boolean.FALSE);
    }
    

}
