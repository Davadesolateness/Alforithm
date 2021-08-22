package Leetcode.L1_500.L1_100;

import java.util.List;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 17:09
 * @Version 1.0
 */
public class L165 {
    public int compareVersion(String version1, String version2) {
       /* String num1[] = version1.split("\\.");
        String num2[] = version2.split("\\.");



        //然后进行判断，versio1>2 或<2的时候，判断前面的字符就可以了
        int i;
        for (i = 0; i < num1.length; i++) {
            //此时判断version2的长度，若version1到末尾了，version2还没有结束，就直接返回
            //此时1如果过长就出判断条件，进行再次判断
            if (i <= num2.length) {
                if (Integer.parseInt(num1[i]) > Integer.parseInt(num2[i])) {
                    return 1;
                } else if (Integer.parseInt(num1[i]) < Integer.parseInt(num2[i])) {
                    return -1;
                }
            } else {
                if (Integer.parseInt(num1[i]) > 0) {
                    return 1;
                }
            }
        }
        //此时剩下的就都是没有判断的version2的内容
        while (i<=num2.length){
            if (Integer.parseInt(num2[i])>0){
                return -1;
            }
        }
        return 0;*/
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int n1 = nums1.length, n2 = nums2.length;

        // compare versions
        int i1, i2;
        for (int i = 0; i < Math.max(n1, n2); ++i) {
            i1 = i < n1 ? Integer.parseInt(nums1[i]) : 0;
            i2 = i < n2 ? Integer.parseInt(nums2[i]) : 0;
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        // the versions are equal
        return 0;
    }
}
