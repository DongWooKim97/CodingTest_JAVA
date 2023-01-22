package inflearn;

import java.util.*;

public class SpecialWordSwitch {

    public String solution(String str) {
        String result;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        result = String.valueOf(s);
        return result;
    }
    public static void main(String[] args) {
        SpecialWordSwitch sw = new SpecialWordSwitch();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(sw.solution(str));

    }
}