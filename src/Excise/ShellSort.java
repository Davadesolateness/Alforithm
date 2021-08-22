package Excise;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 17:38
 * @Version 1.0
 */
public class ShellSort {
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int shell = len / 2;
        int temp;
        while (shell > 0) {
            for (int i = shell; i < len; i++) {
                temp = array[i];
                int preIndex = i - shell;
                while (preIndex > 0 && array[preIndex] > temp) {
                    array[preIndex + shell] = array[preIndex];
                    preIndex -= shell;
                }
                array[preIndex + shell] = temp;
            }
            shell/=2;
        }
        return array;
    }
}
