package Leetcode.L1_500.L1_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 13:40
 * @Version 1.0
 */
public class L017 {
    private String letterMap[] = {
            //0
            " ",
            //1
            "",
            //2
            "abc",
            //3
            "def",
            //4
            "ghi",
            //5
            "jkl",
            //6
            "mno",
            //7
            "pqrs",
            //8
            "tuv",
            //9
            "wxyz",
    };
    private ArrayList<String> res;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<String>();
        if(digits.equals("")){
            return res;
        }

        findCombination(digits,0,"");
        return res;
    }

    private void findCombination(String digits, int index, String s) {

        if (index == digits.length()){
            res.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits,index+1,s+letters.charAt(i));
        }
        return;
    }
}
