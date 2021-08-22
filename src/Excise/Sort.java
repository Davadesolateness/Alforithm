package Excise;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 16:52
 * @Version 1.0
 */

public class Sort {
    public static int[] select(int[] array){
        int length= array.length;
        int min=0,temp;
        for (int i = 0; i < length; i++) {
            min=i;
            for (int j = i+1; j < length; j++) {
                if(array[min]>array[j]){
                    min=j;
                }
            }
            temp=array[min];
            array[min]=array[i];
            array[i]=temp;
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int [] s = {8,5,2,6,9,3,1,4,0,7};
        Sort.select(s);
        System.out.println(Arrays.toString(s));
    }
}
