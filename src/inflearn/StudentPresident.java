package inflearn;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StudentPresident {
    public static void main(String[] args) {
        StudentPresident s = new StudentPresident();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str = sc.next();

        System.out.println(s.solution(str));
    }
    public String solution (String str) {
        HashMap<Character, Integer> h = new HashMap<>();
        String answer = "";


        for(char x: str.toCharArray()) {
            h.put(x, h.getOrDefault(x,0)+1);
        }

        int maxKey = Collections.max(h.values());

        for(char x: h.keySet()) {
            Integer value = h.get((x));

            if( value == maxKey) {
                answer +=x;
                break;
            }
        }

        return answer;
    }



}
