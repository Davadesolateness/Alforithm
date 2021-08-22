package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/21 18:54
 * @Version 1.0
 */
public class L004 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0 || matrix==null) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for (int j = col-1; j >= 0; j--) {
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] > target) {
                    break;
                }
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        L004 intance = new L004();
        int a[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int b[][]={};
        System.out.println(intance.findNumberIn2DArray(b, 0));
    }

}
