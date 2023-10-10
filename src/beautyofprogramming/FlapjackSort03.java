package beautyofprogramming;

/**
 * @author dongzhibo
 * @version 1.0
 * @description: 一摞烙饼排序
 * @date 2023/6/9 16:16
 */
public class FlapjackSort03 {

    /**
     * 烙饼信息数组
     */
    public int[] m_CakeArray;

    /**
     * 烙饼个数
     */
    public int m_nCakeCnt;

    /**
     * 最多的交换次数，最多是m_nCakeCnt * 2
     */
    public int m_nMaxSwap;

    /**
     * 交换结果数组
     */
    public int[] m_SwapArray;

    /**
     * 当前翻转烙饼信息数组
     */
    public int[] m_ReverseCakeArray;

    /**
     * 当前翻转烙饼交换结果数组
     */
    public int[] m_ReverseCakeArraySwap;

    /**
     * 当前搜索次数信息
     */
    public int m_nSearch;

    int[] m_arrSwap;


    public void run(int[] pCakeArray, int nCakeCnt) {
        init(pCakeArray, nCakeCnt);

    }

    /**
     * @param pCakeArray 存储烙饼索引数组
     * @param nCakeCnt   烙饼个数
     * @return
     * @author dongzhibo
     * @date 2023/6/9 16:35
     */
    public void init(int[] pCakeArray, int nCakeCnt) {
        assert pCakeArray != null : "pCakeArray is null";
        assert nCakeCnt > 0 : "nCakeCnt <= 0";

        m_nCakeCnt = nCakeCnt;

        // 初始化烙饼数组
        m_CakeArray = new int[m_nCakeCnt];
        assert m_CakeArray != null : "m_CakeArray is null";
        for (int i = 0; i < m_nCakeCnt; i++) {
            m_CakeArray[i] = pCakeArray[i];
        }

        // 设置最多交换次数信息
        m_nMaxSwap = upBound(m_nCakeCnt);

        // 初始化交换结果数组
        m_SwapArray = new int[m_nMaxSwap];
        assert m_SwapArray != null : "m_SwapArray is null";

        // 初始化中间交换结果信息
        m_ReverseCakeArray = new int[m_nCakeCnt];
        for (int i = 0; i < m_nCakeCnt; i++) {
            m_ReverseCakeArray[i] = m_CakeArray[i];
        }
        m_ReverseCakeArraySwap = new int[m_nMaxSwap];
    }

    /**
     * 烙饼反转此次数的上限
     *
     * @param nCakeCnt 烙饼个数
     * @return
     * @author dongzhibo
     * @date 2023/6/13 11:21
     */
    public int upBound(int nCakeCnt) {
        return nCakeCnt * 2;
    }

    public int lowerBound(int[] pCakeArray, int nCakeCnt) {
        int t, ret = 0;

        // 根据当前数组的排序信息情况来判断最少需要交换多少次
        for (int i = 0; i < nCakeCnt; i++) {
            // 判断位置相邻的两个烙饼，是否为尺寸排序上相邻
            t = pCakeArray[i] - pCakeArray[i - 1];
            if (t == 1 || t == -1) {

            } else {
                ret++;
            }
        }
        return ret;
    }

    public void search(int step) {
        int i;
        int nEstimate;
        m_nSearch++;

        // 估算这次搜索所需要的最小交换次数
        nEstimate = lowerBound(m_ReverseCakeArray, m_nCakeCnt);
        if (step + nEstimate > m_nMaxSwap) {
            return;
        }

        if (isSorted(m_ReverseCakeArray, m_nCakeCnt)) {
            if (step < m_nMaxSwap) {
                m_nMaxSwap = step;
                for ( i = 0; i < m_nMaxSwap; i++) {
                    m_arrSwap[i] = m_ReverseCakeArraySwap[i];
                }
            }
            return;
        }

    }

    /**
     * true 已经排好序
     * false 未排好序
     *
     * @param pCakeArray
     * @param nCakeCnt
     * @return
     */
    public boolean isSorted(int[] pCakeArray, int nCakeCnt) {
        for (int i = 0; i < nCakeCnt; i++) {
            if (pCakeArray[i - 1] > pCakeArray[i]) {
                return false;
            }
        }
        return true;

    }

    public void revert(int nBegin, int nEnd) {
        assert nEnd > nBegin : "nEnd < nBegin is not allowed";
        int i, j, t;
        for (i = nBegin, j = nEnd; i < j; i++, j--) {
            t = m_ReverseCakeArray[i];
            m_ReverseCakeArray[i] = m_ReverseCakeArray[j];
            m_ReverseCakeArray[j] = t;
        }
    }


}
