package Leetcode.L1_500.L101_200;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 12:33
 * @Version 1.0
 */
public class L122 {
    public int maxProfit(int[] prices) {
        //1.升序，2.降序，3.乱序，在乱序中有递增和递减数列，计算即可,类似折线图
        int sum = 0;      //利润总和
        int length = prices.length - 1;
        int start = 0, count = 0;
        while (start <= length) {
            if (prices[start] >= prices[start + 1]) {     //递减数列不改变值，遍历下一个
                start++;
            } else {
                count++;   //记录递增数列的长度，方便下面计算
            }
            if (count != 0) {
                sum += prices[count + start] - prices[start];
                count = 0;
                start=start+count+1;
            }
        }
      return sum;
    }
}
