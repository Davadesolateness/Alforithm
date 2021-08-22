package Excise;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 17:57
 * @Version 1.0
 */
public class Merge {
    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length+right.length];
        for (int index = 0,i=0,j=0; index < result.length; index++) {
            if(i>=left.length){
                result[index] = right[j++];
            }else if(j>=right.length){
                result[index]= left[i++];
            }else if(left[i]>right[j]){
                result[index] = right[j++];
            }else {
                result[index] = left[i++];
            }
        }
        return result;
    }
}
