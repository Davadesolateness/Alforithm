package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/26 8:45
 * @Version 1.0
 */
public class L013 {
    public int romanToInt(String s) {
        int number = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == 'I'){
                if (i < s.length() - 1 && ch[i+1] == 'X' || ch[i+1] == 'V'){
                    number -=1;
                }else {
                    number +=1;
                }
            }else if(ch[i] == 'V'){
                number +=5;
            }else if (ch[i] == 'X'){
                if(i<ch.length-1&&(ch[i+1]=='L'||ch[i+1]=='C')){
                    number -=10;
                }else{
                    number += 10;
                }
            }else if (ch[i] == 'L'){
                number +=50;
            }else if (ch[i] == 'C'){
                if(i<ch.length-1&&(ch[i+1]=='D'||ch[i+1]=='M')){
                    number -=100;
                }else{
                    number += 100;
                }
            }else if (ch[i] == 'D'){
                number +=500;
            }else if (ch[i] == 'M'){
                number +=1000;
            }
        }
        return number;
    }
}
