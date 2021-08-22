package Leetcode.L1_500.L401_500;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/8 11:36
 * @Version 1.0
 */
public class L441 {
    public static int thirdMax(int[] nums) {
        int MIN = Integer.MIN_VALUE;
        int array[] = new int[3];
        array[0]=nums[0];
        array[1]=MIN;
        array[2]= MIN;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= array[0] && nums[i]>array[1] && nums[i]>array[2]){
                array[0]=nums[i];
            }else if(nums[i] < array[0] && nums[i]>=array[1] && nums[i]>array[2]){
                array[1]=nums[i];
            }else {
                array[2]=nums[i];
            }
        }
        if (nums.length<3){
            return array[0];
        }else {
            if(array[2]==0){
                return array[0];
            }else{
                return array[2];
            }
        }
    }

    public static void main(String[] args) {
        int array[]={2,2,3,1};

        System.out.println(L441.thirdMax(array));
    }


}
