package inflearn;

import java.util.Scanner;

public class RemoveDuplicate {

    public String solution(String str) {
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i ) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicate rm = new RemoveDuplicate();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(rm.solution(str));
    }
}
