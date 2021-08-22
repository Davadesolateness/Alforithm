package Leetcode.L500_1000.L501_600;

import java.util.*;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 21:17
 * @Version 1.0
 */
public class L539 {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] times = new int[n];
        Set<Integer> set = new HashSet<>();
        int j = 0;
        for (String time : timePoints) {
            int timeAsInteger = getTime(time);
            times[j++] = timeAsInteger;
            if (!set.add(timeAsInteger)) {
                return 0;
            }
        }
        Arrays.sort(times);

        int min = times[0];
        int max = times[n - 1];
        int minDiff = Integer.MAX_VALUE;
        minDiff = Math.min(minDiff, Math.min(max - min, 60 * 24 - max + min));
        int prev = 0;
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, times[i] - times[prev]);
            prev = i;
        }
        return minDiff;
    }

    private int getTime(String s) {
        return Integer.valueOf(s.substring(0, 2)) * 60 + Integer.valueOf(s.substring(3, 5));
    }
}
