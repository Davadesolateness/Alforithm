package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 16:34
 * @Version 1.0
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 归并排序:
 * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序;
 * 对于子序列递归采用归并排序，直到子序列元素个数为1
 * @param sortArray
 * @return
 */
public class MergeSort {
    public static int[] mergeSort(int[] sortArray){
        if(sortArray==null || sortArray.length<2){
            return sortArray;
        }
        //将序列拆分为子序列
        int mid = sortArray.length/2;
        int[] left = Arrays.copyOfRange(sortArray,0,mid);
        int[] right = Arrays.copyOfRange(sortArray,mid,sortArray.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        for (int index=0,index_left=0,index_right=0;index<result.length;index++){
            if (index_left>=left.length){
                result[index] = right[index_right++];
            }else if(index_right>=right.length){
                result[index] = left[index_left++];
            }else if(left[index_left]<right[index_right]){//判断左边序列和右边序列当前要合并的元素的大小，保证合并的后的结果依然有序
                result[index] = left[index_left++];
            }else{
                result[index] = right[index_right++];
            }
        }
        return result;
    }
}
