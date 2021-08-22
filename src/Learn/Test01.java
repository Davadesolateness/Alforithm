package Learn;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Test01.java
 * @Description TODO
 * @createTime 2021年08月16日 14:08:00
 */
public class Test01 {

    public static int count = 0;

    public int test01(int a) {
        // 2! = 1 * 2        3! = 3 * 2 * 1
        if (a == 1) {
            return 1;
        }

        return a * test01(a - 1);
    }

    public int test02(int a) {
        if (a <= 0) {
            return 0;
        }

        if(a == 1){
            return 1;
        }

        int num = 1;

        for (int i = 1; i <= a; i++) {
            num = num * i;
        }
        return num;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        long startTime = System.currentTimeMillis();
        System.out.println("递归开始时间：" + startTime);
        System.out.println(test01.test01(1000));
        long endTime = System.currentTimeMillis();
        System.out.println("递归结束时间：" + endTime);
        System.out.println("递归求值所需要的时间：" + (endTime - startTime ));

        long startTimeFor = System.currentTimeMillis();
        System.out.println("FOR循环开始时间：" + startTimeFor);
        System.out.println(test01.test02(1000));
        long endTimeFor = System.currentTimeMillis();
        System.out.println("FOR循环结束时间：" + endTimeFor);
        System.out.println("FOR循环求值所需要的时间：" + (endTimeFor - startTimeFor));
    }
}
