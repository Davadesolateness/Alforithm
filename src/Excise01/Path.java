package Excise01;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/24 20:13
 * @Version 1.0
 */
public class Path {
    public static int minPath(int n, int[][] edges, int start, int end){
        int puninshment=0;
        int length  =edges.length;
        int array[] = new int[n];
        if (n==0 || length<=1){//判断输入条件
            return 0;
        }

        int value1=0;//第一个惩罚值
        int value2 =0;//第二个惩罚值
        int s1 = 0;//第一个开始的行数
        int s2 = 0;//第二个开始的行数
        int next=start;
        //第一步，遍历数组，找出start,并且找出start两个路径中最短的哪一个
        while (next != end){//如果当前节点的下一个节点不是结束节点
            for (int i = 0; i < length; i++) {
                if(edges[i][0] == next){//开始节点的第三个路径
                    value1 = puninshment | edges[i][2];
                    s1=i;
                }
            }
            for (int j = length-1; j >= 0; j--) {
                if(edges[j][0] == next){//开始节点的第二个路径
                    value2 = puninshment | edges[j][2];
                    s2=j;
                }
            }
            //判断惩罚值的大小，并且进入下一个节点；
            if(value1< value2){
                puninshment = value1;
                next=edges[s1][1];
            }else {
                puninshment=value2;
                next=edges[s2][1];
            }
        }
        return puninshment;
    }

    public static void main(String[] args) {
        //这个程序，需要将所有节点的来去值都输入，才能判断，就是类似于双向链表
        int s1[][] = {{1,2,1},{2,3,9},{1,3,100},{2,4,4},{3,4,1},{4,3,1},{4,2,4}};
        System.out.println(Path.minPath(3,s1,1,3));
    }
}
