package Leetcode.L500_1000.L601_700;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 7:18
 * @Version 1.0
 */
public class L697 {
    public int findShortestSubArray(int[] nums) {
        //使用hashmap记录每个数第一次和最后一次出现的索引和数量
        Map<Integer,Integer> left = new HashMap<>(),
                right = new HashMap<>(),
                count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null){
                left.put(x,i);
            }
            right.put(x,i);
            count.put(x,count.getOrDefault(x,0)+1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());//返回最大的那个value的值
        for (int x: count.keySet()){//遍历所有的count，选择最短的那个
            if(count.get(x) == degree){
                ans = Math.min(ans,right.get(x)-left.get(x)+1);
            }
        }
        return ans;
    }
}
