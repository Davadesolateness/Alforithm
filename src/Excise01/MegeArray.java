package Excise01;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/24 18:09
 * @Version 1.0
 */
public class MegeArray {
    public static int[][] merge(int[][] intervals){
        int length = intervals.length;
        int array[][]=new int[length][2];
        int a=0;
        for (int i = 0; i < length; i++) {
            array[a][0]=intervals[i][0];
            while (i+1 < length && intervals[i][1] >= intervals[i+1][0] ){//从i出选出重合的部分,虽然循环两次，但是实际上，是循环一次
                i++;
            }
            array[a][1]=intervals[i][1];
            a++;
        }
        return array;
    }

    public static void main(String[] args) {
        int a[][] = {{0,4},{0,0},{6,8}};
        int[][] b=MegeArray.merge(a);
        for (int i = 0; i < b.length; i++) {
            if(b[i][1]==0){
                break;
            }
            System.out.println(b[i][0]+ ","+b[i][1]);
        }
    }
}
