package Leetcode.L500_1000.L501_600;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/28 13:43
 * @Version 1.0
 */
public class L532 {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();;
        int count=0;
        if(k<0){
            return count;
        }
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],0);
            map.put(nums[i],map.get(nums[i]+1));
        }
        for (int i : map.keySet()){
            if (k==0){
                if (map.get(i)>1){
                    count++;
                }
            }else if (map.containsKey(i+k)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        L532 a = new L532();
        int b[] = {1, 3, 1, 5, 4};
        System.out.println(a.findPairs(b,0));
    }
}
