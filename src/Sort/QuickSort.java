package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 11:31
 * @Version 1.0
 */
public class QuickSort {
    /**
     * 快速排序：
     * 通过一趟排序将待排记录按照一个基准值分隔成独立的两部分，其中一部分记录的值均比另一部分的值小
     * 对这两部分记录继续进行快速排序，以达到整个序列有序。
     * @param sortArray
     * @param start
     * @param end
     * @return
     */
    public static int[] quickSort(int[] sortArray,int start,int end){
        if(sortArray == null || sortArray.length<2){
            return sortArray;
        }
        int index = partition(sortArray, start, end);
        if(index>start){
            quickSort(sortArray, start, index-1);
        }
        if(index<end){
            quickSort(sortArray, index+1, end);
        }
        return sortArray;

    }

    /**
     * 对待排序数组的指定范围按照基准值分隔成两个部分，其中一部分的值均比另一部分的值小，并且返回分隔基准值的索引位置
     * @param sortArray
     * @param start 开始范围
     * @param end 结束范围
     * @return
     */
    public static int partition(int[] sortArray,int start,int end){
        int banchmark_index = start+(int)((end-start+1)*Math.random());//选取索引的标准
        int index = start;
        swapArrayElement(sortArray,banchmark_index,end);
        for (int i = start; i <= end; i++) {
            if(sortArray[i]<sortArray[end]){
                if(i>index){//当前元素比基准值小并且当前元素的索引值比左边部分的索引大，则需要交换元素到左边部分，左边部分的范围应该是start——>index
                    //交换数组中两个索引对应的元素值
                    swapArrayElement(sortArray, index, i);
                }
                if(i<end){//增加左边部分的索引，若i=end则表示index当前是基准值所在的位置，不需要再自增
                    index++;
                }
            }
        }
        return index;
    }

    /**
     * 交换数组中两个元素的值
     * @param array
     * @param i
     * @param j
     */
    public static void swapArrayElement(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
