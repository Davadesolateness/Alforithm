package Excise;

import static Excise.QuickSort.swap;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 18:37
 * @Version 1.0
 */
public class Heap {
    //声明全局变量，用于记录数组array的长度；
    static int len;
    /**
     * 堆排序算法
     *
     * @param array
     * @return
     */
    public static int[] HeapSort(int[] array){
        len = array.length;
        if(len<1){
            return array;
        }
        buildMaxHeap(array);
        while (len > 0) {
            swap(array, 0, len - 1);
            len--;
            adjustHeap(array, 0);
        }
        return array;

    }

    private static void buildMaxHeap(int[] array) {
        //从最后一个非叶子节点开始向上构造最大堆
        //for循环这样写会更好一点：i的左子树和右子树分别2i+1和2(i+1)
        for (int i=(len/2-1);i>0;i++){
            adjustHeap(array,i);
        }
    }

    private static void adjustHeap(int[] array, int i) {
        int maxIndex = i;
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 < len && array[i * 2] > array[maxIndex]){
            maxIndex = i * 2;   //感谢网友矫正，之前是i*2+1
        }
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex]){
            maxIndex = i * 2 + 1;//感谢网友矫正，之前是i*2+2
        }
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustHeap(array, maxIndex);
        }

    }
}
