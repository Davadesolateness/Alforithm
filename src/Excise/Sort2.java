package Excise;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 17:14
 * @Version 1.0
 */
public class Sort2 {
    public static int[] insert(int[] array){
        if(array == null || array.length<2){
            return array;
        }
        int length = array.length;
        int a;
        for (int i = 0; i < length-1; i++) {
            a = array[i+1];
            int preIndex=i;
            while (preIndex >=0 && a < array[preIndex]){
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1]=a;
        }
        return array;
    }
}
