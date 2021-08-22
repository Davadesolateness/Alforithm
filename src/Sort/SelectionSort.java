package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 10:26
 * @Version 1.0
 */
public class SelectionSort {
    /**
     * 选择排序:
     * 选择排序是一种简单直观的排序算法。
     * 首先在未排序序列中找到最小（大）元素，存放到已排序序列的起始位置;
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕。
     * @param sortArray
     * @return
     */

    public static int [] selectionSort(int[] sortArray){
        if (sortArray == null || sortArray.length < 2){
            return sortArray;
        }
        int length = sortArray.length;
        int min=sortArray[0];
        for (int i = 1; i < length; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                if(sortArray[j]<sortArray[minIndex]){//元素的值比当前最小元素的值小时，更新本趟排序寻找的最小元素索引
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = sortArray[i];
                sortArray[i] = sortArray[minIndex];
                sortArray[minIndex]=temp;
            }
        }
        return sortArray;
    }
}
