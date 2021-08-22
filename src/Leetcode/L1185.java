package Leetcode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/7/13 21:03
 * @Version 1.0
 */
public class L1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        //将本年之前的年份循环相加
        int sum = 0;
        for (int i = 1971; i < year; i++) {
            sum+=leapYear(i);
        }
        //计算本年的天数
        return null;

    }

    /**
     * 判断是否时闰年，闰年返回366天，不是返回365天
     */
    public int leapYear(int year) {
        int a=4;
        int b=100;
        if (year % a == 0 && year % b != 0) {
            return 366;
        }else{
            return 365;
        }

    }

    /**
     * 计算本年的天数
     */
    public int thisYear(int year){
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {10,90,70,60,40};
        int[] arr1 = new int[]{2,3,4,45};
    }
}
