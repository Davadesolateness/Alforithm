package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 9:16
 * @Version 1.0
 */
public class BubbleSort {
    /**
     * 冒泡排序:
     * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列;
     * 一次比较两个元素,如果它们的顺序错误就把它们交换过来;
     * 走访数列的工作是重复的进行,直到没有再需要交换的元素，也就是说该数列已经排序完成。
     *
     * @param sortArray
     * @return
     */

    public static int[] bubbleSort(int[] sortArray) {
        if (sortArray == null || sortArray.length < 2) {
            return sortArray;
        }
        int length = sortArray.length;
        int temp;
        for (int i = 0; i < length; i++) {
            boolean is_swap = false;
            for (int j = 0; j < length-1-i; j++) {
                if(sortArray[j] > sortArray[j+1]){
                    temp = sortArray[j];
                    sortArray[j]=sortArray[j+1];
                    sortArray[j+1]=temp;
                    is_swap =true;
                }
            }
            if (!is_swap){
                break;
            }
        }
        return sortArray;
    }
}
