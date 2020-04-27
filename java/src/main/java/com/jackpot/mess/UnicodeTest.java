package main.java.jackpot.mess;

/**
 * @Author: hanjt
 * @Date: 2018/10/16 14:13
 * @Description: 获得某单词每个字母的ASCII码
 */
public class UnicodeTest {
    public static void main(String[] args) {
        String name = "jAckpotHan";
        for(int i = 0,j = name.length();i<j;i++) {
            int index = name.offsetByCodePoints(0, i);
            int cp = name.codePointAt(index);
            System.out.println(cp);
        }
    }
}
