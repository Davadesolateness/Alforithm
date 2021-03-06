package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 10:44
 * @Version 1.0
 */
public class InsertionSort {
    /**
     * 插入排序:
     * 插入排序是一种简单直观的排序算法。
     * 它是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入,
     * 在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
     * @param sortArray
     * @return
     */
    public static int[] insertionSort(int[] sortArray){
        if(sortArray == null || sortArray.length<2){
            return sortArray;
        }
        for (int i = 0; i < sortArray.length - 1; i++) {
            int index = i;
            int temp = sortArray[index+1];
            while (index>=0 && temp<sortArray[index]){
                sortArray[index+1] = sortArray[index];
                index--;
            }
            sortArray[index+1] = temp;
        }
        return sortArray;
    }
}
