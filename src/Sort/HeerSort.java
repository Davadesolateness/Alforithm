package Sort;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 12:09
 * @Version 1.0
 */
public class HeerSort {
    /**
     * 希尔排序：
     * 希尔排序也是一种插入排序，它是简单插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序。
     * 希尔排序是把记录按一定增量分组（例如：增量为5，那么索引为0,5,10，15....的这些元素为一组），对每组使用直接插入排序算法排序；
     * 随着增量逐渐减少，每组包含的元素越来越多，当增量减至1时，所有元素被分成一组，算法便终止。
     * @param sortArray
     * @return
     */
    public static int[] heerSort(int[] sortArray){
        if(sortArray == null || sortArray.length<2){
            return sortArray;
        }
        int increment = sortArray.length/2;
        while (increment>0){
            for (int i = increment;i<sortArray.length;i++){
                int index = i - increment;
                int tmp = sortArray[i];
                while (index > 0 && tmp<sortArray[index]){
                    sortArray[index+increment] =sortArray[index];
                    index-=increment;
                }
                sortArray[index+increment] = tmp;
            }
            increment /=2;
        }
        return sortArray;
    }
}
