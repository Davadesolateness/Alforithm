package Leetcode.L1_500.L201_300;

import java.util.HashSet;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/8 12:36
 * @Version 1.0
 */
public class L219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }


}
