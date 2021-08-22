package kuaishou.B01;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 17:12
 * @Version 1.0
 */
public class bumanyi {
    /**
     * 根据顾客属性计算出顾客排队顺序
     * @param a int整型一维数组 顾客a属性
     * @param b int整型一维数组 顾客b属性
     * @return int整型一维数组
     */
    public int[] WaitInLine (int[] a, int[] b) {
        // write code here
        int x,y;
        int min=manyidu(a,b);
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (min>manyidu(a,b)){
                    min=manyidu(a,b);
                    x=a[i];
                    y=b[i];
                    a[i]=a[i+1];
                    b[i]=b[i+1];
                    a[i+1]=x;
                    b[i+1]=y;
                }
            }
        }
        return a;
    }

    public int manyidu(int[] a,int[] b){
        int length = a.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum=sum+a[i]*(i)+b[i]*(length-1-i);
        }
        return sum;
    }
}
