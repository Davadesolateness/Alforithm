package Excise;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 17:25
 * @Version 1.0
 */
public class Bubble {
    public static int[] bubbleSort(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
