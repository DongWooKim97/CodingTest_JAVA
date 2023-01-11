package inflearn;

import java.util.*;

public class SpecialWordSwitch{

    public String solution(String str) {
        String answer;
        int lt = 0;
        int rt = str.length()-1;
        char [] c = str.toCharArray();
        while(lt<rt) {
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
    public static void main(String [] args) {
        SpecialWordSwitch s = new SpecialWordSwitch();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}