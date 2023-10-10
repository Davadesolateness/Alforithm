package Leetcode.L1_500.L1_100;

import java.util.HashMap;
import java.util.Map;

/**
 * ����һ���ַ��� s �������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 * ʾ�� 1:
 * <p>
 * ����: s = "abcabcbb"
 * ���: 3
 * ����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
 * <p>
 * ʾ�� 2:
 * <p>
 * ����: s = "bbbbb"
 * ���: 1
 * ����: ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1��
 * <p>
 * ����: s = "pwwkew"
 * ���: 3
 * ����: ��Ϊ���ظ��ַ�����Ӵ���"wke"�������䳤��Ϊ 3��
 * ��ע�⣬��Ĵ𰸱����� �Ӵ� �ĳ��ȣ�"pwke"��һ�������У������Ӵ���
 */
public class L003 {


    /**
     * ����һ���ַ��� s �������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
     * abcdefaaabbzxckjvakdlfjaskdf
     * 1. �ȱ�֤�Ӵ������ظ��ַ�
     * 2. Ȼ����ȷ���Ӵ��ĳ��ȣ��Ӵ��Ӧ�ò�����26��
     * ʵ�ֲ��裺
     * 1. ά��һ�������飬
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans,end - start +1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}
