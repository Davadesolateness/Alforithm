package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 10:40
 * @Version 1.0
 */
public class L008 {
    public int myAtoi(String str) {
        int len = str.length();
        // str.charAt(i) 方法回去检查下标的合法性，一般先转换成字符数组
        char[] charArray = str.toCharArray();

        //1.去除前导空格
        int index = 0;
        while (index < len && charArray[index] == ' ') {
            index++;
        }

        //2.遍历完成，针对边界用例如“     ”
        if (index == len) {
            return 0;
        }

        //3.如果出现符号字符，仅第一个有效，并记录正负
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        //4.将后续的字符进行转换
        //不能使用long类型，这是题目说的
        int res = 0;
        while (index < len) {
            char currChar = charArray[index];
            //4.1判断不合法的情况
            if (currChar > '9' || currChar < '0') {
                break;
            }

            //题目中说只能存储32为大小的有符号整数，需要提前判断，计算乘以10之后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            // 4.2 合法的情况下，才考虑转换，每一步都把符号位乘进去
            res = res * 10 + sign * (currChar - '0');
            index++;

        }
        return res;

    }
}
