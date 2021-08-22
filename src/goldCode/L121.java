package goldCode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/28 15:27
 * @Version 1.0
 */
public class L121 {
    public int maxProfit(int[] prices) {
        if (prices.length<=1){
            return 0;
        }
        int min=prices[0],max=0;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        L121 l = new L121();
        int [] a = {7,1,5,4,6,4};
        System.out.println(l.maxProfit(a));
    }
}
