package Leetcode.L1_500.L401_500;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/29 14:24
 * @Version 1.0
 */
public class L451 {
    public String frequencySort(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        int [] freq = new int[256];
        for (char c: s.toCharArray()){
            freq[c]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0){
                char ch = (char)i;
                String str = map.get(freq[i]);
                //字符串出现次数相同进行拼接
                if(str != null){
                    String strNew = str.concat(build(ch,freq[i]));
                    map.put(freq[i],strNew);
                }else {
                    map.put(freq[i],build(ch,freq[i]));
                }
            }
        }

        Integer[] keys = map.keySet().toArray(new Integer[]{});
        Arrays.sort(keys);
        StringBuilder sbl = new StringBuilder();
        for (int i = keys.length - 1; i >= 0; i--) {
            sbl.append(map.get(keys[i]));
        }

        return sbl.toString();
    }

    private String build(char ch, int times) {
        String string = Character.toString(ch);
        StringBuilder res = new StringBuilder(string);
        int t = 1;
        while (t < times){
            res.append(string);
            t++;
        }
        return res.toString();
    }
}
