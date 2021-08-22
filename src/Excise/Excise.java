package Excise;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/25 16:17
 * @Version 1.0
 */
public class Excise {
    public static int arr(int[][] array, int a) {
        int ab[] = new int[100];
        int min1=10000;
        int min2=10000;
        int min3=10000;
        int row1=0,col1=0;
        int row2=0,col2=0;
        int row3=0,col3=0;
        int sum=0;
        int length = array[0].length;
        for (int i = 0; i < length-1 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(min1 > Math.abs(array[0][i]-array[j][i+1])){
                    min1 = Math.abs(array[0][i]-array[j][i+1]);
                    row1= 0;
                    col1 = j;
                }
                if(min2 > Math.abs(array[1][i]-array[j][i+1])){
                    min2 = Math.abs(array[1][i]-array[j][i+1]);
                    row2 = 1;
                    col2 = j;
                }
                if(min3 > Math.abs(array[2][i]-array[j][i+1])){
                    min3 = Math.abs(array[2][i]-array[j][i+1]);
                    row3 = 2;
                    col3 = j;
                }

                if(min1 > min2 ){
                   if (min1 < min3){
                       ab[row1]=array[row1][col1];
                       sum+=min1;
                   }
                }else if ( min2 < min3){
                    if(min2 < min1){
                        ab[row2]=array[row2][col2];
                        sum+=min2;
                    }
                }else {
                    ab[row3]=array[row3][col3];
                    sum+=min3;
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int ar[][]={{4,7,4,10,4}, {5,9,5,4,4}, {2,9,10,2,3}};
        System.out.println(Excise.arr(ar,5));
    }
}
