package Leetcode.L1_500.L101_200;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 8:47
 * @Version 1.0
 */
public class L167 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) {
            return null;
        }
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
