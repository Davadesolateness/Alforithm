package Excise;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 18:09
 * @Version 1.0
 */
public class QuickSort {
    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end){
        int privot = array[start];
       while (start<end){
           while (start<end && array[start]>=privot){
               end--;
           }
           array[start] = array[end];
           while (start<end && array[start]<=privot){
               start++;
           }
           array[end]=array[start];
       }
       array[start]=privot;
       return start;
    }

    /**
     * 交换数组内两个元素
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] quickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end){
            return null;
        }
        int smallIndex = partition(array, start, end);
        if (smallIndex > start){
            quickSort(array, start, smallIndex - 1);
        }
        if (smallIndex < end){
            quickSort(array, smallIndex + 1, end);
        }
        return array;
    }

    public static void main(String[] args) {
        int [] s = {8,5,2,6,9,3,1,4,0,7};
        QuickSort.quickSort(s,0,10);
        for (int i = 0; i < s.length; i++) {
            System.out.println(i);
        }
    }
}
