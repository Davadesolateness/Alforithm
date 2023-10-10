package beautyofprogramming;

public class CpuOccupancy01 {
    public static void cpu01(){
        long startTime = 10;
        long busyTime = 1000;
        long idleTime = 10;
        for (;;) {
            startTime = System.currentTimeMillis();
            while (System.currentTimeMillis()  - startTime <= busyTime){
                System.out.println("循环");
            }
            try {
                Thread.sleep(idleTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void cpu02(){

        for (;;) {
            System.out.println("循环");
        }
    }


}
