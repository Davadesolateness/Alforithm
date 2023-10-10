package beautyofprogramming;


/**
 * @author dongzhibo
 * @version 1.0
 * @description: 中国象棋将帅问题
 * @date 2023/6/9 11:00
 */
public class ChessGeneral02 {
    public final int HALF_LENGTH = 4;

    // 全掩码，255 2^8 1111 1111
    public final int FULL_MASK = 255;

    // 左掩码 1111 1111 0000
    public final int LEFT_MASK = FULL_MASK << HALF_LENGTH;

    // 右掩码，0000 1111
    public final int RIGHT_MASK = FULL_MASK >> HALF_LENGTH;

    public Integer b = 0;

    public final int GRID_WIDTH = 3;

    public void RIGHT_SET(int n) {
        b = (b & LEFT_MASK) ^ n;
    }

    public void LEFT_SET(int n) {
        b = (b & RIGHT_MASK) ^ (n << HALF_LENGTH);
    }

    public Integer RIGHT_GET() {
        Integer c = (b & RIGHT_MASK);
        return c;
    }

    public Integer LEFT_GET() {
        Integer c = (b & LEFT_MASK) >> HALF_LENGTH;
        return c;
    }

    public void LEFT_ADD(int n) {
        b = ((LEFT_GET() + n) << HALF_LENGTH) ^ RIGHT_GET();
    }

    public void RIGHT_ADD(int n) {
        b = b + n;
    }

    /**
     * 按照for循环进行判断
     *
     * @param
     * @return
     * @author dongzhibo
     * @date 2023/6/9 14:23
     */
    public  void solution01() {
        for (LEFT_SET(1); LEFT_GET() <= GRID_WIDTH * GRID_WIDTH; LEFT_ADD(1)) {
            for (RIGHT_SET(1); RIGHT_GET() <= GRID_WIDTH * GRID_WIDTH; RIGHT_ADD(1)) {
                if (LEFT_GET() % GRID_WIDTH != RIGHT_GET() % GRID_WIDTH) {
                    System.out.println("A = " + LEFT_GET() + ", B = " + RIGHT_GET());
                }
            }
        }
    }

    public void solution02() {
        Integer i = 81;
        while (i-- > 0) {
            if (i / 9 % 3 == i % 9 % 3) {
                continue;
            }
            System.out.println("A = " + (i / 9 + 1) + ", B = " + (i % 9 + 1));
        }
    }
}
