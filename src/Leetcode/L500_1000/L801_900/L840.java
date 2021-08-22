package Leetcode.L500_1000.L801_900;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/28 11:11
 * @Version 1.0
 */
public class L840 {

    public static int numMagicSquaresInside(int[][] grid) {
        //第一步确定幻方的起点为0.0
        //第二步，检查幻方内的数子是否不同
        int sum=0;
        int row = grid.length -3;
        int col = grid[0].length - 3;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if(check(grid,i,j)){
                    sum++;
                }
            }
        }
        return sum;

    }

    public static boolean check(int[][] grid,int x,int y){
        int s = 0;
        //遍历幻方内的数组
        int []arr = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(grid[x+i][y+j] <1 || grid[x+i][y+j]>9){
                    return false;
                }else {
                    arr[grid[x+i][y+j]]=1;
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            arr[0] += arr[i];
        }
        if (arr[0] != 9){
            return false;
        }
        s = grid[x][y] + grid[x][y+1]+grid[x][y+2];

        //遍历各个行和列
        //第二行
        if (s != grid[x+1][y] + grid[x+1][y+1]+grid[x+1][y+2]){
            return false;
        }
        //第三行
        if (s != grid[x+2][y] + grid[x+2][y+1]+grid[x+2][y+2]){
            return false;
        }
        //第一列
        if (s != grid[x][y] + grid[x+1][y]+grid[x+2][y]){
            return false;
        }
        //第二列
        if (s != grid[x][y+1] + grid[x+1][y+1]+grid[x+2][y+1]){
            return false;
        }
        //第三列
        if (s != grid[x][y+2] + grid[x+1][y+2]+grid[x+2][y+2]){
            return false;
        }
        //对角线
        if (s != grid[x][y] + grid[x+1][y+1]+grid[x+2][y+2]){
            return false;
        }
        if (s != grid[x][y+2] + grid[x+1][y+1]+grid[x+2][y]){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] arr = {{3,2,9,2,7},{6,1,8,4,2},{7,5,3,2,7},{2,9,4,9,6},{4,3,8,2,5}};
        System.out.println(L840.numMagicSquaresInside(arr));
    }
}
