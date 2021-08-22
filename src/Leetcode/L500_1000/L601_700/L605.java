package Leetcode.L500_1000.L601_700;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/28 14:30
 * @Version 1.0
 */
//种花问题
/*    假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。

            给定一个花坛（表示为一个数组包含0和1，
其中0表示没种植花,1表示种植了花),和一个数n能否在不打破种植规则的情况下种入n朵花？能则返回True,不能则返回False.
*/

public class L605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0){
            return false;
        }

        //主要是遍历该节点的下一个可以种植的节点
        //如果当前节点是1，则下个能种植的节点是3
        for (int i = 0; i < flowerbed.length-3; i++) {
            //首先判断当前节点是否为第一个节点
            if( i == 0){
                if (flowerbed[i] == 0){
                    if (flowerbed[i+1] == 0){
                        n--;
                        i=i+1;
                    }else {
                        i=i+1;
                    }
                }
                continue;
            }
            if (flowerbed[i] == 0){
                if (flowerbed[i+1] == 0){
                    if (flowerbed[i+2] == 0 ){
                        n--;
                        i+=1;
                    }else {
                        i=i+2;
                    }
                }else {
                    i+=1;
                }
            }
        }
        return n>0 ? false : true;
    }

    public static void main(String[] args) {
        L605 l = new L605();
        int [] a = {1,0,0,0,0,1};
        System.out.println(l.canPlaceFlowers(a,2));
    }
}
