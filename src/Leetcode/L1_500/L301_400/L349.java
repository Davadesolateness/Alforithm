package Leetcode.L1_500.L301_400;

public class L349 {
    public static void main(String[] args) {

    }

    /**
     * 找两个数组的交集，遍历数据长度最小的那个即可
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        int numLength1 = nums1.length;
        int numLength2 = nums2.length;
        if (numLength1 <= numLength2) {
            return findArray(nums1, nums2);
        } else {
            return findArray(nums2, nums1);
        }
    }

    public int[] findArray(int[] nums1, int[] nums2) {
        //进入此数组后，一定是nums1.length < nums2.length
        int[] num = new int[nums1.length];
        int k = 0;
        boolean flag = true;
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                // 如果找到，就直接跳出循环
                if (temp == nums2[j]) {
                    if (!continueTheCount(num, temp)) {
                        num[k++] = temp;
                        break;
                    }
                    if (temp == 0 && flag) {
                        k++;
                        flag = true;
                        break;
                    }
                }
            }
        }
        // 循环赋值一个新数组
        int[] numTemp = new int[k];
        for (int i = 0; i < k; i++) {
            numTemp[i] = num[i];
        }
        return numTemp;
    }

    public boolean continueTheCount(int[] num, int k) {
        if (num != null && num.length > 0) {
            for (int i = 0; i < num.length; i++) {
                if (k == num[i]) {
                    return true;
                }
                if (k == 0 && num[i] == 0) {
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
